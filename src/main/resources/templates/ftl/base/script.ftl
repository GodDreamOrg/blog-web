<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<!-- BEGIN CORE PLUGINS -->
<!--[if lt IE 9]>
<script src="${base}/plugins/respond.min.js"></script>
<script src="${base}/plugins/excanvas.min.js"></script>
<![endif]-->
<script src="${base}/plugins/jquery-1.10.2.min.js" type="text/javascript"></script>
<script src="${base}/plugins/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
<!-- IMPORTANT! Load jquery-ui-1.10.3.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
<script src="${base}/plugins/jquery-ui/jquery-ui-1.10.3.custom.min.js" type="text/javascript"></script>
<script src="${base}/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="${base}/plugins/bootstrap-hover-dropdown/twitter-bootstrap-hover-dropdown.min.js" type="text/javascript" ></script>
<script src="${base}/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="${base}/plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script src="${base}/plugins/jquery.cookie.min.js" type="text/javascript"></script>
<script src="${base}/plugins/uniform/jquery.uniform.min.js" type="text/javascript" ></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script src="${base}/plugins/jqvmap/jqvmap/jquery.vmap.js" type="text/javascript"></script>
<script src="${base}/plugins/jqvmap/jqvmap/maps/jquery.vmap.russia.js" type="text/javascript"></script>
<script src="${base}/plugins/jqvmap/jqvmap/maps/jquery.vmap.world.js" type="text/javascript"></script>
<script src="${base}/plugins/jqvmap/jqvmap/maps/jquery.vmap.europe.js" type="text/javascript"></script>
<script src="${base}/plugins/jqvmap/jqvmap/maps/jquery.vmap.germany.js" type="text/javascript"></script>
<script src="${base}/plugins/jqvmap/jqvmap/maps/jquery.vmap.usa.js" type="text/javascript"></script>
<script src="${base}/plugins/jqvmap/jqvmap/data/jquery.vmap.sampledata.js" type="text/javascript"></script>
<script src="${base}/plugins/flot/jquery.flot.js" type="text/javascript"></script>
<script src="${base}/plugins/flot/jquery.flot.resize.js" type="text/javascript"></script>
<script src="${base}/plugins/jquery.pulsate.min.js" type="text/javascript"></script>
<script src="${base}/plugins/bootstrap-daterangepicker/moment.min.js" type="text/javascript"></script>
<script src="${base}/plugins/bootstrap-daterangepicker/daterangepicker.js" type="text/javascript"></script>
<script src="${base}/plugins/gritter/js/jquery.gritter.js" type="text/javascript"></script>
<!-- IMPORTANT! fullcalendar depends on jquery-ui-1.10.3.custom.min.js for drag & drop support -->
<script src="${base}/plugins/fullcalendar/fullcalendar/fullcalendar.min.js" type="text/javascript"></script>
<script src="${base}/plugins/jquery-easy-pie-chart/jquery.easy-pie-chart.js" type="text/javascript"></script>
<script src="${base}/plugins/jquery.sparkline.min.js" type="text/javascript"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="${base}/scripts/app.js" type="text/javascript"></script>
<script src="${base}/scripts/index.js" type="text/javascript"></script>
<script src="${base}/scripts/tasks.js" type="text/javascript"></script>
<!-- END PAGE LEVEL SCRIPTS -->
<script>


    $(window).load(function(){
        setTimeout(function(){$(window).scrollTop(0);},0);

    })
    jQuery(document).ready(function() {
        App.init(); // initlayout and core plugins
        Index.init();
        Index.initJQVMAP(); // init index page's custom scripts
        Index.initCalendar(); // init index page's custom scripts
        Index.initCharts(); // init index page's custom scripts
        Index.initChat();
        Index.initMiniCharts();
        Index.initDashboardDaterange();
        Index.initIntro();
        Tasks.initDashboardWidget();
    });
</script>
<!-- END JAVASCRIPTS -->