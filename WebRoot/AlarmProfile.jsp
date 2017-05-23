    <%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
	<jsp:include page="template/header.jsp" flush="true"/><!--动态包含header-->


	<div class="content-wrapper" style="min-height: 916px;">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
           	 我的告警
            <small>进行传感器告警的查看</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="index"><i class="fa fa-dashboard"></i> 首页</a></li>
            <li class="active">我的告警</li>
          </ol>
        </section>

        <!-- Main content -->
        <section class="content">

          <!-- SELECT2 EXAMPLE -->
          
          <div class="box box-info">
                <div class="box-body">
                  <div id="example2_wrapper" class="dataTables_wrapper form-inline dt-bootstrap"><div class="row"><div class="col-sm-6"></div><div class="col-sm-6"></div></div><div class="row"><div class="col-sm-12"><table id="example2" class="table table-bordered table-hover dataTable" role="grid" aria-describedby="example2_info">
                    <thead>
                      <tr role="row">
                      	<th class="sorting_asc" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Rendering engine: activate to sort column descending">#</th>
                      	<th class="sorting_asc" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Rendering engine: activate to sort column descending">传感器名称</th>
                      	<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Platform(s): activate to sort column ascending">数据类型</th>
                      	<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Platform(s): activate to sort column ascending">数据单位</th>
                      	<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Engine version: activate to sort column ascending">告警规则</th>
                      	<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Engine version: activate to sort column ascending">实际值</th>
                      	<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Engine version: activate to sort column ascending">发生时间</th>
                      </tr>
                    </thead>
                    <tbody> 
                    	<c:forEach var="AlarmData" items="${requestScope.pagebean.contentData}" varStatus="status">  
                     		<tr role="row" class="odd">
                    		<td>${status.count}</td>
                        	<td class="sorting_1">${AlarmData.deviceName}</td>
                        	<td>${AlarmData.type}</td>
                        	<td>${AlarmData.symbol}</td>
                        	<td>${AlarmData.alarmRuleContent}</td>
                        	<td><span class="badge bg-green">${AlarmData.actualValue}</span></td>
                        	<td>${AlarmData.saveTime}</td>
                      		</tr>
                    	</c:forEach>
                      </tbody>
                  </table></div></div>
                  
                   <div class="row">
                  		<div class="col-sm-5">
                  			<div class="dataTables_info" id="example2_info" role="status" aria-live="polite">共搜索到${pagebean.totalRecords}条符合条件的数据</div>
                  		</div>
                  		<div class="col-sm-7">
                  			<div class="dataTables_paginate paging_simple_numbers" id="example2_paginate">
                  				<jsp:include page="template/pagination.jsp" flush="true"/><!--动态包含分页页码-->
                  			</div>
                  		</div>
                  	</div>
                  
                  
                  </div>
                </div><!-- /.box-body -->
              </div><!-- /.box -->

        </section>
        <!-- /.content -->
      </div>
     
    <!-- jQuery 2.1.4 -->
    <script src="plugins/jQuery/jQuery-2.1.4.min.js"></script>
      
	<script>
		$(document).ready(function(){
		$( "#datepicker" ).datepicker({  
            dateFormat:'yy-mm-dd',  //更改时间显示模式  
            showAnim:"slide",       //显示日历的效果slide、fadeIn、show等  
            changeMonth:true,       //是否显示月份的下拉菜单，默认为false  
            changeYear:true,        //是否显示年份的下拉菜单，默认为false  
            showButtonPanel:true,   //是否显示取消按钮，并含有today按钮，默认为false  
            closeText:'清除',      //设置关闭按钮的值   
            clearStatus:'清除已选日期',
            closeText:'关闭',
            closeStatus:'不改变当前选择',
            prevText:'<上月',
            prevStatus:'显示上月',
            prevBigText:'<<',
            prevBigStatus:'显示上一年',
            nextText:'下月>',
            nextStatus:'显示下月',
            nextBigText:'>>',
            nextBigStatus:'显示下一年',
            currentText:'今天',
            currentStatus:'显示本月',
            monthNames:['一月','二月','三月','四月','五月','六月','七月','八月','九月','十月','十一月','十二月'],
            monthNamesShort: ['一月', '二月', '三月', '四月', '五月', '六月', '七月', '八月', '九月', '十月', '十一月', '十二月'],
            monthStatus:'选择月份',
            yearStatus:'选择年份',
            weekHeader:'周',
            weekStatus:'年内周次',
            dayNames:['星期日','星期一','星期二','星期三','星期四','星期五','星期六'],
            dayNamesShort:['周日','周一','周二','周三','周四','周五','周六'],
            dayNamesMin:['日','一','二','三','四','五','六'],
            dayStatus:'设置DD为一周起始',
            dateStatus:'选择m月d日，DD',
            firstDay:1,
            initStatus:'请选择日期',
            isRTL:false
            });
		});
	</script>
	
	<script>
		$(document).ready(function(){
		$( "#datepicker_end" ).datepicker({  
            dateFormat:'yy-mm-dd',  //更改时间显示模式  
            showAnim:"slide",       //显示日历的效果slide、fadeIn、show等  
            changeMonth:true,       //是否显示月份的下拉菜单，默认为false  
            changeYear:true,        //是否显示年份的下拉菜单，默认为false  
            showButtonPanel:true,   //是否显示取消按钮，并含有today按钮，默认为false  
            closeText:'清除',      //设置关闭按钮的值   
            clearStatus:'清除已选日期',
            closeText:'关闭',
            closeStatus:'不改变当前选择',
            prevText:'<上月',
            prevStatus:'显示上月',
            prevBigText:'<<',
            prevBigStatus:'显示上一年',
            nextText:'下月>',
            nextStatus:'显示下月',
            nextBigText:'>>',
            nextBigStatus:'显示下一年',
            currentText:'今天',
            currentStatus:'显示本月',
            monthNames:['一月','二月','三月','四月','五月','六月','七月','八月','九月','十月','十一月','十二月'],
            monthNamesShort: ['一月', '二月', '三月', '四月', '五月', '六月', '七月', '八月', '九月', '十月', '十一月', '十二月'],
            monthStatus:'选择月份',
            yearStatus:'选择年份',
            weekHeader:'周',
            weekStatus:'年内周次',
            dayNames:['星期日','星期一','星期二','星期三','星期四','星期五','星期六'],
            dayNamesShort:['周日','周一','周二','周三','周四','周五','周六'],
            dayNamesMin:['日','一','二','三','四','五','六'],
            dayStatus:'设置DD为一周起始',
            dateStatus:'选择m月d日，DD',
            firstDay:1,
            initStatus:'请选择日期',
            isRTL:false
            });
		});
	</script>
	
	<script type="text/javascript">
		function getQueryString(name) {
  			var reg = new RegExp('(^|&)' + name + '=([^&]*)(&|$)', 'i');
  			var r = window.location.search.substr(1).match(reg);
  			if (r != null) {
    			return unescape(r[2]);
  			}
  			return null;
		}

        function toPage(num){
        	var url = window.location.pathname+'?currentPage='+num;
        	if(getQueryString("deviceid")!=null)
        		url += "&deviceid="+getQueryString("deviceid");
        	if(getQueryString("start_day")!=null)
        		url += "&start_day="+getQueryString("start_day");
        	if(getQueryString("end_day")!=null)
        		url += "&end_day="+getQueryString("end_day");
        	location.href=url;
        }     
    </script>

    <jsp:include page="template/footer.jsp" flush="true"/><!--动态包含footer-->  