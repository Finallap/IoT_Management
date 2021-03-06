  <%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
 
	<jsp:include page="template/header.jsp" flush="true"/><!--动态包含header-->


      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
            欢迎进入物联网智能终端管理系统
            <small>Version 1.0</small>
          </h1>
        </section>

        <!-- Main content -->
        <section class="content">

          <!-- Your Page Content Here -->

          <div class="row">
            <div class="col-md-3 col-sm-6 col-xs-12">
              <div class="info-box">
              	<a href="ProjectProfile">
                	<span class="info-box-icon bg-aqua"><i class="fa fa-fw fa-list-alt"></i></span>
                </a>
                <div class="info-box-content">
                  <a href="ProjectProfile">
                  	<span class="info-box-text">项目</span>
                  	<span class="info-box-number">${ProjectNum}</span>
                  </a>
                </div><!-- /.info-box-content -->
              </div><!-- /.info-box -->
            </div><!-- /.col -->
            
            <div class="col-md-3 col-sm-6 col-xs-12">
              <div class="info-box">
              	<a href="SensingDeviceProfile?currentPage=1">
                	<span class="info-box-icon bg-yellow"><i class="fa fa-fw fa-gg-circle"></i></span>
                </a>
                <div class="info-box-content">
                  <a href="SensingDeviceProfile?currentPage=1">
                  	<span class="info-box-text">传感设备</span>
                  	<span class="info-box-number">${SensingDeviceNum}</span>
                  </a>
                </div><!-- /.info-box-content -->
              </div><!-- /.info-box -->
            </div><!-- /.col -->

            <!-- fix for small devices only -->
            <div class="clearfix visible-sm-block"></div>

			
            <div class="col-md-3 col-sm-6 col-xs-12">
              <div class="info-box">
                <a href="ControllingDeviceProfile?currentPage=1">
                	<span class="info-box-icon bg-green"><i class="fa fa-fw fa-external-link-square"></i></span>
                </a>
                <div class="info-box-content">
                  <a href="ControllingDeviceProfile?currentPage=1">
                  	<span class="info-box-text">控制设备</span>
                  	<span class="info-box-number">${ControllingDeviceNum}</span>
                  </a>
                </div><!-- /.info-box-content -->
              </div><!-- /.info-box -->
            </div><!-- /.col -->
            
            
            <div class="col-md-3 col-sm-6 col-xs-12">
              <div class="info-box">
              	<a href="AlarmProfile">
                	<span class="info-box-icon bg-red"><i class="ion ion-ios-information-outline"></i></span>
                </a>
                <div class="info-box-content">
                  <a href="AlarmProfile">
                  	<span class="info-box-text">近期告警</span>
                  	<span class="info-box-number">${AlarmDataNum}</span>
                  </a>
                </div><!-- /.info-box-content -->
              </div><!-- /.info-box -->
            </div><!-- /.col -->
          </div>

        </section><!-- /.content -->
      </div><!-- /.content-wrapper -->



    <!-- jQuery 2.1.4 -->
    <script src="plugins/jQuery/jQuery-2.1.4.min.js"></script>

     <script>
      $(function () {
        /* ChartJS
         * -------
         * Here we will create a few charts using ChartJS
         */

        //--------------
        //- AREA CHART -
        //--------------

        // Get context with jQuery - using jQuery's .get() method.
        var areaChartCanvas = $("#areaChart").get(0).getContext("2d");
        // This will get the first returned node in the jQuery collection.
        var areaChart = new Chart(areaChartCanvas);

        var areaChartData = {
          labels: ["January", "February", "March", "April", "May", "June", "July"],
          datasets: [
            {
              label: "Electronics",
              fillColor: "rgba(210, 214, 222, 1)",
              strokeColor: "rgba(210, 214, 222, 1)",
              pointColor: "rgba(210, 214, 222, 1)",
              pointStrokeColor: "#c1c7d1",
              pointHighlightFill: "#fff",
              pointHighlightStroke: "rgba(220,220,220,1)",
              data: [65, 59, 80, 81, 56, 55, 40]
            },
            {
              label: "Digital Goods",
              fillColor: "rgba(60,141,188,0.9)",
              strokeColor: "rgba(60,141,188,0.8)",
              pointColor: "#3b8bba",
              pointStrokeColor: "rgba(60,141,188,1)",
              pointHighlightFill: "#fff",
              pointHighlightStroke: "rgba(60,141,188,1)",
              data: [28, 48, 40, 19, 86, 27, 90]
            }
          ]
        };

        var areaChartOptions = {
          //Boolean - If we should show the scale at all
          showScale: true,
          //Boolean - Whether grid lines are shown across the chart
          scaleShowGridLines: false,
          //String - Colour of the grid lines
          scaleGridLineColor: "rgba(0,0,0,.05)",
          //Number - Width of the grid lines
          scaleGridLineWidth: 1,
          //Boolean - Whether to show horizontal lines (except X axis)
          scaleShowHorizontalLines: true,
          //Boolean - Whether to show vertical lines (except Y axis)
          scaleShowVerticalLines: true,
          //Boolean - Whether the line is curved between points
          bezierCurve: true,
          //Number - Tension of the bezier curve between points
          bezierCurveTension: 0.3,
          //Boolean - Whether to show a dot for each point
          pointDot: false,
          //Number - Radius of each point dot in pixels
          pointDotRadius: 4,
          //Number - Pixel width of point dot stroke
          pointDotStrokeWidth: 1,
          //Number - amount extra to add to the radius to cater for hit detection outside the drawn point
          pointHitDetectionRadius: 20,
          //Boolean - Whether to show a stroke for datasets
          datasetStroke: true,
          //Number - Pixel width of dataset stroke
          datasetStrokeWidth: 2,
          //Boolean - Whether to fill the dataset with a color
          datasetFill: true,
          //String - A legend template
          legendTemplate: "<ul class=\"<\%=name.toLowerCase()%>-legend\"><\% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<\%=datasets[i].lineColor%>\"></span><\%if(datasets[i].label){%><\%=datasets[i].label%><\%}%></li><\%}%></ul>",
          //Boolean - whether to maintain the starting aspect ratio or not when responsive, if set to false, will take up entire container
          maintainAspectRatio: true,
          //Boolean - whether to make the chart responsive to window resizing
          responsive: true
        };

        //Create the line chart
        areaChart.Line(areaChartData, areaChartOptions);

        //-------------
        //- LINE CHART -
        //--------------
        var lineChartCanvas = $("#lineChart").get(0).getContext("2d");
        var lineChart = new Chart(lineChartCanvas);
        var lineChartOptions = areaChartOptions;
        lineChartOptions.datasetFill = false;
        lineChart.Line(areaChartData, lineChartOptions);

      });
    </script>
	
    <jsp:include page="template/footer.jsp" flush="true"/><!--动态包含footer-->  