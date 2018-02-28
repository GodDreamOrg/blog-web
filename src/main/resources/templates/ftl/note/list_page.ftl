<!-- BEGIN PAGE HEADER-->
 <div class="row">
     <div class="col-md-12">
         <!-- BEGIN PAGE TITLE & BREADCRUMB-->
         <h3 class="page-title">
             日记管理
             <small>日记列表</small>
         </h3>
         <ul class="page-breadcrumb breadcrumb">
             <li>
                 <i class="icon-home"></i>
                 <a href="index.html">主页</a>
                 <i class="icon-angle-right"></i>
             </li>
             <li>
                 <a href="index.html">日记管理</a>
                 <i class="icon-angle-right"></i>
             </li>
             <li><a href="#">日记列表</a></li>
             <li class="pull-right">
                 <div id="dashboard-report-range" class="dashboard-date-range tooltips" data-placement="top"
                      data-original-title="Change dashboard date range">
                     <i class="icon-calendar"></i>
                     <span></span>
                     <i class="icon-angle-down"></i>
                 </div>
             </li>
         </ul>
         <!-- END PAGE TITLE & BREADCRUMB-->
     </div>
 </div>
<!-- END PAGE HEADER-->
<!-- BEGIN PAGE CONTENT-->
 <div class="row">
     <div class="col-md-12">
         <div class="panel-body" style="padding-bottom:0px;">
             <div class="panel panel-default">
                 <div class="panel-heading">查询条件</div>
                 <div class="panel-body">
                     <form id="formSearch" class="form-horizontal">
                         <div class="form-group" style="margin-top:15px">
                             <label class="control-label col-sm-1" for="txt_search_departmentname">笔记名称</label>
                             <div class="col-sm-3">
                                 <input type="text" class="form-control" id="noteName">
                             </div>
                             <label class="control-label col-sm-1" for="txt_search_statu">笔记标题</label>
                             <div class="col-sm-3">
                                 <input type="text" class="form-control" id="noteTitle">
                             </div>
                             <div class="col-sm-4" style="text-align:left;">
                                 <button type="button" style="margin-left:50px" id="btn_query" class="btn btn-primary">查询
                                 </button>
                             </div>
                         </div>
                     </form>
                 </div>
             </div>

         <#-- 渲染的table目标-->
             <table id="table_list" class="table table-bordered">
             </table>

         <#-- toolbar-->
             <div id="toolbar" class="btn-group">
                 <button id="btn_add" type="button" class="btn btn-default" data-toggle="modal" data-target="#noteAddModal">
                     <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
                 </button>
                 <button id="btn_edit" type="button" class="btn btn-default">
                     <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
                 </button>
                 <button id="btn_delete" type="button" class="btn btn-default">
                     <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
                 </button>
             </div>
         </div>
         
        <!-- add 模态框（Modal） -->
		<div class="modal fade" id="noteAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		    <div class="modal-dialog">
		        <div class="modal-content">
		            <div class="modal-header">
		                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
		                <h4 class="modal-title" id="myModalLabel">note新增</h4>
		            </div>
		            <form action="${base}/manager/note/add" enctype="multipart/form-data" method="post">
					    <table>
					        <tr>
					            <td>笔记名称:</td>
					            <td><input type="text" name="noteName"></td>
					        </tr>
							<tr>
					            <td>笔记标题:</td>
					            <td><input type="text" name="noteTitle"></td>
					        </tr>
					        <tr>
					            <td>请选择文件:</td>
					            <td><input type="file" name="file"></td>
					        </tr>
				            <tr class="modal-footer">
				                <td><button type="button" class="btn btn-default" data-dismiss="modal">关闭</button></td>
				                <td><button type="submit" class="btn btn-primary">新增提交</button></td>
				            </tr>
					    </table>
					</form>
		        </div>
		    </div>
		</div>
		
		<!-- update 模态框（Modal） -->
		<div class="modal fade" id="noteUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		    <div class="modal-dialog">
		        <div class="modal-content">
		            <div class="modal-header">
		                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
		                <h4 class="modal-title" id="myModalLabel">note修改</h4>
		            </div>
		            <form action="${base}/manager/note/update" enctype="multipart/form-data" method="post">
					    <table>
					        <tr>
					            <td>笔记名称:</td>
					            <td><input id="noteUpdateName" type="text" name="noteName"></td>
					        </tr>
							<tr>
					            <td>笔记标题:</td>
					            <td><input id="noteUpdateTitle" type="text" name="noteTitle"></td>
					        </tr>
				            <tr class="modal-footer">
				                <td><button type="button" class="btn btn-default" data-dismiss="modal">关闭</button></td>
				                <td><button type="submit" class="btn btn-primary">修改提交</button></td>
				            </tr>
					    </table>
					</form>
		        </div>
		    </div>
		</div>
         
     </div>
 </div>
<!-- END PAGE CONTENT-->
<script src="${base}/js/ftl/note/note_list.js"></script>