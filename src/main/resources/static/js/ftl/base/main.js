$(function () {
    var leftAllDataUrl = base + "/base/leftAllData";
    // 创建一棵树
    var tree = new Tree();
    // 创建一个侧边栏
    var left = new Left(tree);
    // 初始化侧边栏
    left.Init(leftAllDataUrl);
});

var TreeNode = function (data) {
    var Othis = new Object();
    var OchildList = new Array();

    Othis.type = 'type' in data ? data.type : null;
    Othis.url = 'url' in data ? data.url : null;
    Othis.name = 'name' in data ? data.name : null;
    Othis.sort = 'sort' in data ? data.sort : null;
    Othis.id = 'id' in data ? data.id : null;
    Othis.parentId = 'parentId' in data ? data.parentId : null;
    Othis.childList = 'childList' in data ? data.childList : null;

    var initChild = function () {
        var childList = data.childList;

        if (childList == null) {
            return;
        }

        // 遍历所有子集
        for (i = 0; i < childList.length; i++) {
            var childTreeNode = new TreeNode(childList[i]);
            OchildList[i] = childTreeNode;
        }

        // 改变子集对象
        Othis.childList = OchildList;
    };

    // 默认初始化子集
    initChild();

    return Othis;
};

var SimpleDrawTree = function () {
    var Othis = new Object();

    var drawByTop = function (treeNote) {
        var html = "";
        if (treeNote.type === 2){
            html+= "<li url='"+treeNote.url+"'>"+treeNote.name+"</li>";
        }
        if (treeNote.type === 1) {
            html+= "<ul>"+treeNote.name;
        }
        var childList = treeNote.childList;
        if (!childList) {
            return html;
        }
        // 遍历所有子集
        for (i = 0; i < childList.length; i++) {
            html += drawByTop(childList[i]);
        }
        if (treeNote.type === 1) {
            html+= "</ul>";
        }
        return html;
    };

    Othis.drawByTop = function (treeNote) {
        console.log(drawByTop(treeNote));
    };

    return Othis;
};

var Tree = function () {
    var Othis = new Object();
    var Otree;
    var simpleDraw = new SimpleDrawTree();

    var draw = function () {
        simpleDraw.drawByTop(Otree);
    };

    Othis.Draw = function () {
        // 绘制树
        draw();
    };

    Othis.Init = function (data) {
        // 初始化树
        Otree = new TreeNode(data);
        // 构建树
        draw();
    };

    return Othis;
};

var Left = function (tree) {
    var Othis = new Object();
    var Otree = tree;

    Othis.Init = function (url) {
        $.ajax({
            url: url,
            type: 'POST',
            dataType: 'json',
            success: Otree.Init,
            error: function (data) {
                console.log("获取数据失败," + data);
            }
        });
    };

    Othis.Draw = function () {
        Otree.Draw();
    };

    return Othis;
};