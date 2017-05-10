    <%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
 
	<jsp:include page="template/header.jsp" flush="true"/><!--动态包含header-->


	<div class="content-wrapper" style="min-height: 916px;">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
           	 数据查看
            <small>进行传感器数据的查看</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="index"><i class="fa fa-dashboard"></i> 首页</a></li>
            <li><a href="SensingDeviceProfile?currentPage=1">传感设备管理</a></li>
            <li class="active">传感设备数据查看</li>
          </ol>
        </section>

        <!-- Main content -->
        <section class="content">

          <!-- SELECT2 EXAMPLE -->
          <div class="box box-primary">
          	<!-- form start -->
            <form role="form" method="post" action="">
            <div class="box-header with-border">
              <h3 class="box-title">查询条件选择</h3>
              <div class="box-tools pull-right">
                <button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                <button class="btn btn-box-tool" data-widget="remove"><i class="fa fa-remove"></i></button>
              </div>
            </div><!-- /.box-header -->
            
            <div class="box-body">
              <div class="row">
                <div class="box-body">
                  	<div class="col-md-6">
                  		<div class="form-group">
                    		<label for="exampleInputEmail1">选择设备</label>
                    		<select id="device" name="deviceid" onchange="selectschool(this);" class="form-control select2 select2-hidden-accessible"  style="width: 100%;" tabindex="-1" aria-hidden="true"></select>
                   		</div>
                    	<div class="form-group">
                    		<label for="exampleInputEmail1">选择数据类型</label>
                    		<select id="type" name="typeid" class="form-control select2 select2-hidden-accessible" style="width: 100%;" tabindex="-1" aria-hidden="true"></select>
                    	</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
                    		<label>开始时间</label>
                    		<div class="input-group">
                      		<div class="input-group-addon">
                        		<i class="fa fa-clock-o"></i>
                      		</div>
                      		<input class="form-control pull-right" id="datepicker" type="text" name="start_day" value="${start_day}">
                    		</div><!-- /.input group -->
                    	</div>
                    	<div class="form-group">
                  			<label>结束时间</label>
                    		<div class="input-group">
                      		<div class="input-group-addon">
                        		<i class="fa fa-clock-o"></i>
                      		</div>
                      		<input class="form-control pull-right" id="datepicker_end" type="text" name="end_day" value="${end_day}">
                      		</div><!-- /.input group -->
                    	</div>
                    </div>
                 </div>         
              </div><!-- /.row -->
            </div><!-- /.box-body -->
            
            <div class="box-footer">
            	<input type="submit" class="btn btn-primary"/>
            </div>
            </form>
          </div><!-- /.box -->
          
          <div class="box box-info">
                <div class="box-body">
                  <div id="example2_wrapper" class="dataTables_wrapper form-inline dt-bootstrap"><div class="row"><div class="col-sm-6"></div><div class="col-sm-6"></div></div><div class="row"><div class="col-sm-12"><table id="example2" class="table table-bordered table-hover dataTable" role="grid" aria-describedby="example2_info">
                    <thead>
                      <tr role="row">
                      	<th class="sorting_asc" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Rendering engine: activate to sort column descending">#</th>
                      	<th class="sorting_asc" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Rendering engine: activate to sort column descending">传感器名称</th>
                      	<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Browser: activate to sort column ascending">所属项目</th>
                      	<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Platform(s): activate to sort column ascending">数据类型</th>
                      	<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Engine version: activate to sort column ascending">数据单位</th>
                      	<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Engine version: activate to sort column ascending">值</th>
                      	<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Engine version: activate to sort column ascending">时间</th>
                      </tr>
                    </thead>
                    <tbody>
                      
                    <tr role="row" class="odd">
                    	<td>1</td>
                        <td class="sorting_1">温度传感器1</td>
                        <td>南邮气象系统</td>
                        <td>df-df-df-dfd-dfd-df-df</td>
                        <td>三牌楼校区</td>
                        <td><span class="badge bg-green">3</span></td>
                        <td>2017-05-03 17:05:45</td>
                      </tr>
                      <tr role="row" class="even">
                      	<td>1</td>
                        <td class="sorting_1">Gecko</td>
                        <td>Firefox 1.5</td>
                        <td>Win 98+ / OSX.2+</td>
                        <td>1.8</td>
                        <td><span class="badge bg-green">3</span></td>
                        <td>2017-05-03 17:05:45</td>
                      </tr>
                      <tr role="row" class="odd">
                      	<td>1</td>
                        <td class="sorting_1">Gecko</td>
                        <td>Firefox 2.0</td>
                        <td>Win 98+ / OSX.2+</td>
                        <td>1.8</td>
                        <td><span class="badge bg-green">3</span></td>
                        <td>2017-05-03 17:05:45</td>
                      </tr>
                      </tbody>
                  </table></div></div><div class="row"><div class="col-sm-5"><div class="dataTables_info" id="example2_info" role="status" aria-live="polite">共搜索到57条符合条件的数据</div></div><div class="col-sm-7"><div class="dataTables_paginate paging_simple_numbers" id="example2_paginate"><ul class="pagination"><li class="paginate_button previous disabled" id="example2_previous"><a href="#" aria-controls="example2" data-dt-idx="0" tabindex="0">上一页</a></li><li class="paginate_button active"><a href="#" aria-controls="example2" data-dt-idx="1" tabindex="0">1</a></li><li class="paginate_button "><a href="#" aria-controls="example2" data-dt-idx="2" tabindex="0">2</a></li><li class="paginate_button "><a href="#" aria-controls="example2" data-dt-idx="3" tabindex="0">3</a></li><li class="paginate_button "><a href="#" aria-controls="example2" data-dt-idx="4" tabindex="0">4</a></li><li class="paginate_button "><a href="#" aria-controls="example2" data-dt-idx="5" tabindex="0">5</a></li><li class="paginate_button "><a href="#" aria-controls="example2" data-dt-idx="6" tabindex="0">6</a></li><li class="paginate_button next" id="example2_next"><a href="#" aria-controls="example2" data-dt-idx="7" tabindex="0">下一页</a></li></ul></div></div></div></div>
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
    	var list1 = new Array;
    	var list2 = new Array;

    	list1[list1.length] ="1";
		list1[list1.length] ="2";
		list1[list1.length] ="3";
		list1[list1.length] ="4";
		list2[list2.length] = new Array("401","406","407","408","501","502","503","504","505","506","507","508","509","510");
		list2[list2.length] = new Array("101","102","103","104","105","106","107","113","114","115","116","117","118","203","204","205","208","209","211","212","213","214","215","216","225","226","300","301","302","303","304","305","308","309","311","312","313","400","401","402","403","404","405","409","410","413","414","415","506","507","508","509","510","512","516","518","519","520");
		list2[list2.length] = new Array("101","102","103","104","105","106","107","108","109","201","202","203","204","205","208","213","300","301","302","303","304","305","308","309","310","312","313","401","402","403","404","405","408","410","412","413","506","507","508","509","510","511","513","515","520");
		list2[list2.length] = new Array("101","102","103","104","109","110","201","202","204","205","208","300","301","306","308","309","311","312","313","405","406","410");
    
    	var ddlschool = document.getElementById("device");
   	 	var ddlmajor = document.getElementById("type");
   	 	for(var i =0;i<list1.length; i++)
    	{
        var option = document.createElement("option");
        option.appendChild(document.createTextNode(list1[i]));
        option.value = list1[i];
        ddlschool.appendChild(option);
        //major initialize
        var firstschool = list2[0];
        for (var j = 0; j < firstschool.length; j++) {
            var optionmajor = document.createElement("option");
            optionmajor.appendChild(document.createTextNode(firstschool[j]));
            optionmajor.value = firstschool[j];
            ddlmajor.appendChild(optionmajor);
        	}
    	}
    	function indexof(obj,value)
    	{
        	var k=0;
        	for(;k<obj.length;k++)
        	{
            	if(obj[k] == value)
           		return k;
        	}
        	return k;
    	}
    	function selectschool(obj) {
        	ddlmajor.options.length = 0;//clear
        	var index = indexof(list1,obj.value);
        	var list2element = list2[index];
        	for(var i =0;i<list2element.length; i++)
        	{
            	var option = document.createElement("option");
            	option.appendChild(document.createTextNode(list2element[i]));
            	option.value = list2element[i];
            	ddlmajor.appendChild(option);
        	}
    	}
	</script>

    <jsp:include page="template/footer.jsp" flush="true"/><!--动态包含footer-->  