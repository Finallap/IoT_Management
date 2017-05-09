  <%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
 
	<jsp:include page="template/header.jsp" flush="true"/><!--动态包含header-->


	<div class="content-wrapper" style="min-height: 916px;">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
            	传感设备详情
            <small>在此页面查看传感设备详细信息</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="index.jsp"><i class="fa fa-dashboard"></i> 首页</a></li>
            <li><a href="SensingDeviceProfile.jsp">传感设备管理</a></li>
            <li class="active">传感设备详情</li>
          </ol>
        </section>

        <!-- Main content -->
        <section class="content">
		<div class="row">
            <div class="col-md-3">

              <!-- Profile Image -->
              <div class="box box-primary">
                <div class="box-body box-profile">
                  <img class="profile-user-img img-responsive img-circle" src="dist/img/SensingDevice -128x128.jpg" alt="User profile picture">
                  <h3 class="profile-username text-center">${device.deviceName}</h3>
                  <p class="text-muted text-center">${device.projectName}</p>

                  <ul class="list-group list-group-unbordered">
                  	<li class="list-group-item">
                      <b>DeviceKey</b> <a class="pull-right">${device.deviceKey}</a>
                    </li>
                    <li class="list-group-item">
                      <b>MAC地址</b> <a class="pull-right">${device.mac}</a>
                    </li>
                    <li class="list-group-item">
                      <b>使用协议</b> <a class="pull-right">${device.protocol}</a>
                    </li>
                  </ul>

                  <a href="EditSensingDevice?deviceid=${device.sensingDeviceId}" class="btn btn-primary btn-block"><b>编辑</b></a>
                </div><!-- /.box-body -->
              </div><!-- /.box -->

              <!-- About Me Box -->
              <div class="box box-primary">
                <div class="box-header with-border">
                  <h3 class="box-title">关于此设备</h3>
                </div><!-- /.box-header -->
                <div class="box-body">
                  
				  <strong><i class="fa fa-map-marker margin-r-5"></i>放置地点</strong>
                  <p class="text-muted">${device.localtion}</p>
                  
                  <hr>

                  <strong><i class="fa fa-book margin-r-5"></i>设备描述</strong>
                  <p class="text-muted">
                    	${device.description}
                  </p>
                  
                </div><!-- /.box-body -->
              </div><!-- /.box -->
            </div><!-- /.col -->
            <div class="col-md-9">
              <div class="nav-tabs-custom">
                <ul class="nav nav-tabs">
                  <li class="active"><a href="#activity" data-toggle="tab" aria-expanded="true">数据类型</a></li>
                  <li class=""><a href="#timeline" data-toggle="tab" aria-expanded="false">最近数据</a></li>
                </ul>
                <div class="tab-content">
                  <div class="tab-pane active" id="activity">
                  <div class="box-body" style="display: block;">
                  <div class="table-responsive">
                    <table class="table no-margin">
                      <thead>
                        <tr>
                          <th>#</th>
                          <th>类型名称</th>
                          <th>单位符号</th>
                          <th>数据</th>
                          <th>操作</th>
                        </tr>
                      </thead>
                      <tbody>
                        <tr>
                          <td><a href="pages/examples/invoice.html">1</a></td>
                          <td>温度传感器1</td>
                          <td>dfsdfsafdsfdsgfhgfjjugf</td>
                          <td>
							<a href="#"><i class="fa fa-fw fa-upload"></i>查看导出</a>
						  </td>
                          <td>
                    		<a href="#"><i class="fa fa-fw fa-edit"></i></a>
                    		<a href="#" data-toggle="modal" data-target="#delete-sensingdevice-1"><i class="fa fa-fw fa-remove"></i></a>
                    		
                    		                    		
                    	
                     <div class="modal modal-danger" id="delete-sensingdevice-1" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                         <div class="modal-content">
                           <div class="modal-header">
                             <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                              <h4 class="modal-title">传感器删除</h4>
                            </div>
                            <div class="modal-body">
                             <p>您目前正在删除数据类型“xxxx”，请确定是否删除？</p>
                            </div>
                           <div class="modal-footer">
                              <button type="button" class="btn btn-outline pull-left" data-dismiss="modal">否</button>
                              <button type="button" class="btn btn-outline">删除</button>
                            </div>
                          </div><!-- /.modal-content -->
                        </div><!-- /.modal-dialog -->
                      </div>
            
              		
                    		
                          </td>
                        </tr>

                      </tbody>
                    </table>
                  </div><!-- /.table-responsive -->
                </div><!-- /.box-body -->
                <div class="box-footer clearfix" style="display: block;">
                  <a href="#" class="btn btn-sm btn-info btn-flat pull-right" data-toggle="modal" data-target="#add-data-type">增加数据类型</a>
                  
                  
                  
            <div class="modal" id="add-data-type"  tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
              <div class="modal-dialog">
                <div class="modal-content">
                  <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                    <h4 class="modal-title">创建数据类型</h4>
                  </div>
                  <form role="form" method="post" action="">
                  	<div class="modal-body">
                    	<div class="form-group">
                      		<label for="exampleInputEmail1">数据类型名称</label>
                      		<input type=text class="form-control" id="exampleInputEmail1" placeholder="输入数据类型名称">
                    	</div>
                    	<div class="form-group">
                     		<label for="exampleInputEmail1">数据单位</label>
                      		<input type=text class="form-control" id="exampleInputEmail2" placeholder="输入数据单位">
                  		</div>
                  		<div class="form-group">
                     		<label for="exampleInputEmail1">传感器标记</label>
                      		<input type=text class="form-control" id="exampleInputEmail2" placeholder="输入传感设备对于本数据的标记">
                  		</div>
                  	</div><!-- /.box-body -->
                  	<div class="modal-footer">
                    	<button type="button" class="btn btn-default pull-left" data-dismiss="modal">关闭</button>
                    	<button type="button" class="btn btn-primary">创建</button>
                  	</div>
                  </form>
                </div><!-- /.modal-content -->
              </div><!-- /.modal-dialog -->
            </div><!-- /.modal -->

                  
                </div><!-- /.box-footer -->
                  </div><!-- /.tab-pane -->
                  
                  
                  <div class="tab-pane" id="timeline">
                  <div class="box-header with-border">
                  <h3 class="box-title">传感器最近十条上传数据</h3>
                </div><!-- /.box-header -->
                <div class="box-body">
                  <table class="table table-bordered">
                    <tbody><tr>
                      <th style="width: 10px">#</th>
                      <th>设备</th>
                      <th>类型</th>
                      <th style="width: 40px">值</th>
                      <th>时间</th>
                    </tr>
                    <tr>
                      <td>1.</td>
                      <td>Update software</td>
                      <td>温度</td>
                      <td><span class="badge bg-red">55%</span></td>
                      <td>2016-04-14 05:12:25</td>
                    </tr>
                    <tr>
                      <td>2.</td>
                      <td>Clean database</td>
                      <td>温度</td>
                      <td><span class="badge bg-yellow">70%</span></td>
                      <td>2016-04-14 05:12:25</td>
                    </tr>
                    <tr>
                      <td>3.</td>
                      <td>Cron job running</td>
                      <td>温度</td>
                      <td><span class="badge bg-light-blue">30%</span></td>
                      <td>2016-04-14 05:12:25</td>
                    </tr>
                    <tr>
                      <td>4.</td>
                      <td>Fix and squish bugs</td>
                      <td>温度</td>
                      <td><span class="badge bg-green">90%</span></td>
                      <td>2016-04-14 05:12:25</td>
                    </tr>
                  </tbody></table>
                </div><!-- /.box-body -->
                  </div><!-- /.tab-pane -->
                </div><!-- /.tab-content -->
              </div><!-- /.nav-tabs-custom -->
            </div><!-- /.col -->
          </div>
          
          <!-- Main row -->
        </section>
        
      </div>

      <jsp:include page="template/footer.jsp" flush="true"/><!--动态包含footer-->  