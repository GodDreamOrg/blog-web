<!-- BEGIN PORTLET-->
   <div class="portlet solid bordered light-grey">
      <div class="portlet-title">
         <div class="caption"><i class="icon-bar-chart"></i>Site Visits</div>
         <div class="tools">
            <div class="btn-group" data-toggle="buttons">
               <label class="btn default btn-sm active">
               <input type="radio" name="options" class="toggle" id="option1">Users
               </label>
               <label class="btn default btn-sm">
               <input type="radio" name="options" class="toggle" id="option2">Feedbacks
               </label>
            </div>
         </div>
      </div>
      <div class="portlet-body">
         <div id="site_statistics_loading">
            <img src="assets/img/loading.gif" alt="loading"/>
         </div>
         <div id="site_statistics_content" class="display-none">
            <div id="site_statistics" class="chart"></div>
         </div>
      </div>
   </div>
   <!-- END PORTLET-->