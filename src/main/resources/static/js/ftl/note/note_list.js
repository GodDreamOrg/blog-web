$(function () {

    //1.初始化Table
    var oTable = new TableInit();
    oTable.Init();

    //2.初始化Button的点击事件
    var oButtonInit = new ButtonInit(oTable);
    oButtonInit.Init();

});

var TableInit = function () {
    var oTableInit = new Object();
    var table = $('#table_list');
    //初始化Table
    oTableInit.Init = function () {
        table.bootstrapTable({
            url: base+'/manager/note/list',         //请求后台的URL（*）
            method: 'post',                      //请求方式（*）
            toolbar: '#toolbar',                //工具按钮用哪个容器
            striped: true,                      //是否显示行间隔色
            cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            pagination: true,                   //是否显示分页（*）
            sortable: false,                     //是否启用排序
            sortOrder: "asc",                   //排序方式
            queryParams: oTableInit.queryParams,//传递参数（*）
            sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
            pageNumber:1,                       //初始化加载第一页，默认第一页
            pageSize: 10,                       //每页的记录行数（*）
            pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
            showColumns: false,                  //是否显示所有的列
            dataType: 'json',                   //服务器返回数据类型
            contentType: 'application/x-www-form-urlencoded',
            showRefresh: false,                  //是否显示刷新按钮
            minimumCountColumns: 2,             //最少允许的列数
            clickToSelect: true,                //是否启用点击选中行
            height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
            uniqueId: "ID",                     //每一行的唯一标识，一般为主键列
            showToggle:false,                    //是否显示详细视图和列表视图的切换按钮
            cardView: false,                    //是否显示详细视图
            detailView: false,                   //是否显示父子表
            columns: [{
                checkbox: true
            }, {
                field: 'noteName',
                title: '笔记名称',
                formatter:function (value, row, index) {
                    return value;
                }
            }, {
                field: 'noteTitle',
                title: '笔记标题'
            }
            ]
        });
    };

    //得到查询的参数
    oTableInit.queryParams = function (params) {
        var temp = {   //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
            limit: params.limit,   //页面大小
            offset: params.offset,  //页码
            noteName: $("#noteName").val(),
            noteTitle: $("#noteTitle").val()
        };
        return temp;
    };

    oTableInit.Refresh = function(){
        table.bootstrapTable('refresh');
    };
    return oTableInit;
};

var ButtonInit = function (oTable) {
    var oInit = new Object();
    var postdata = {};
    var queryBtn = $("#btn_query");
    var btnEdit = $("#btn_edit");
    var btnDelete = $("#btn_delete");

    oInit.Init = function () {
        //初始化页面上面的按钮事件
        queryBtn.click(function(){
            oTable.Refresh();
        });
        btnEdit.click(function(){
        	var a= $('#table_list').bootstrapTable('getSelections'); 
//        	console.log("↓↓↓↓↓↓↓↓↓↓");
//        	console.log(a);
//        	console.log("↑↑↑↑↑↑↑↑↑↑");
        	if(a.length<1){  
        		alert("请选中一行");
        		return;
        	}
        	if(a.length>1){
        		alert("修改请勿多行操作");
        		return;
        	}
        	$("#noteUpdateName").val(a[0].noteName);
        	$("#noteUpdateTitle").val(a[0].noteTitle);
        	$('#noteUpdateModal').modal('show');
        });
        btnDelete.click(function(){
        	var url = base+"/manager/note/delete";
        	var a = $('#table_list').bootstrapTable('getSelections');
        	var list = JSON.stringify(a);
        	if(a.length<1){  
        		alert("请至少选中一行");
        		return;
        	}
        	$.ajax({
        		type: "POST",
                url: url,
                data: {
                	"list":list
                },
                success: function(data){
                         if (data == "success") {
                        	 alert("删除成功");//TODO 成功后展示页面
						}else{
							alert("删除失败");
						}
                   }
        	});
        });
    };

    return oInit;
};