    <%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
 
	<jsp:include page="template/header.jsp" flush="true"/><!--动态包含header-->


	<div class="content-wrapper" style="min-height: 916px;">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
           	 控制日志查看
            <small>进行控制日志的查看</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="index.jsp"><i class="fa fa-dashboard"></i> 首页</a></li>
            <li><a href="SensingDeviceProfile.jsp">控制设备管理</a></li>
            <li class="active">控制设备日志查看</li>
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
                    		<label>开始时间</label>
                    		<div class="input-group">
                      		<div class="input-group-addon">
                        		<i class="fa fa-clock-o"></i>
                      		</div>
                      		<input class="form-control pull-right" id="datepicker" type="text">
                    		</div><!-- /.input group -->
                    	</div>
                  		<div class="form-group">
                    		<label for="exampleInputEmail1">选择设备</label>
                    		<select id="Device" name="Device" class="form-control select2 select2-hidden-accessible"  style="width: 100%;" tabindex="-1" aria-hidden="true"></select>
                   		</div>
					</div>
					<div class="col-md-6 ">
                    	<div class="form-group">
                  			<label>结束时间</label>
                    		<div class="input-group">
                      		<div class="input-group-addon">
                        		<i class="fa fa-clock-o"></i>
                      		</div>
                      		<input class="form-control pull-right" id="datepicker_end" type="text">
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
                      	<th class="sorting_asc" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Rendering engine: activate to sort column descending">控制设备名称</th>
                      	<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Browser: activate to sort column ascending">所属项目</th>
                      	<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Platform(s): activate to sort column ascending">控制项目</th>
                      	<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Engine version: activate to sort column ascending">值</th>
                      	<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Engine version: activate to sort column ascending">控制时间</th>
                      </tr>
                    </thead>
                    <tbody>
                      
                    <tr role="row" class="odd">
                    	<td>1</td>
                        <td class="sorting_1">温度控制器1</td>
                        <td>南邮气象系统</td>
                        <td>df-df-df-dfd-dfd-df-df</td>
                        <td><span class="badge bg-green">3</span></td>
                        <td>2017-05-04 17:05:06</td>
                      </tr>
                      <tr role="row" class="even">
                      	<td>1</td>
                        <td class="sorting_1">Gecko</td>
                        <td>Firefox 1.5</td>
                        <td>Win 98+ / OSX.2+</td>
                        <td><span class="badge bg-green">3</span></td>
                        <td>2017-05-04 17:05:06</td>
                      </tr>
                      <tr role="row" class="odd">
                      	<td>1</td>
                        <td class="sorting_1">Gecko</td>
                        <td>Firefox 2.0</td>
                        <td>Win 98+ / OSX.2+</td>
                        <td><span class="badge bg-green">3</span></td>
                        <td>2017-05-04 17:05:06</td>
                      </tr>
                      </tbody>
                  </table></div></div><div class="row"><div class="col-sm-5"><div class="dataTables_info" id="example2_info" role="status" aria-live="polite">共搜索到57条符合条件的数据</div></div><div class="col-sm-7"><div class="dataTables_paginate paging_simple_numbers" id="example2_paginate"><ul class="pagination"><li class="paginate_button previous disabled" id="example2_previous"><a href="#" aria-controls="example2" data-dt-idx="0" tabindex="0">上一页</a></li><li class="paginate_button active"><a href="#" aria-controls="example2" data-dt-idx="1" tabindex="0">1</a></li><li class="paginate_button "><a href="#" aria-controls="example2" data-dt-idx="2" tabindex="0">2</a></li><li class="paginate_button "><a href="#" aria-controls="example2" data-dt-idx="3" tabindex="0">3</a></li><li class="paginate_button "><a href="#" aria-controls="example2" data-dt-idx="4" tabindex="0">4</a></li><li class="paginate_button "><a href="#" aria-controls="example2" data-dt-idx="5" tabindex="0">5</a></li><li class="paginate_button "><a href="#" aria-controls="example2" data-dt-idx="6" tabindex="0">6</a></li><li class="paginate_button next" id="example2_next"><a href="#" aria-controls="example2" data-dt-idx="7" tabindex="0">下一页</a></li></ul></div></div></div></div>
                </div><!-- /.box-body -->
              </div><!-- /.box -->

        </section>
        <!-- /.content -->
      </div>
     

    <jsp:include page="template/footer.jsp" flush="true"/><!--动态包含footer-->  