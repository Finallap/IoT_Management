  <%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
	<jsp:include page="template/header.jsp" flush="true"/><!--动态包含header-->


	<div class="content-wrapper" style="min-height: 916px;">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
            	项目详情查看
            <small>在此页面查看项目详细信息</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="index.jsp"><i class="fa fa-dashboard"></i> 首页</a></li>
            <li><a href="ProjectProfile.jsp">项目管理</a></li>
            <li class="active">项目详情</li>
          </ol>
        </section>

        <!-- Main content -->
        <section class="content">

          <!-- Main row -->
          <div class="row">
            <!-- Left col -->
            <div class="col-md-3">
            
            <div class="box box-primary">
                <div class="box-body box-profile">
                  <img class="profile-user-img img-responsive img-circle" src="dist/img/Project -160x160.jpg" alt="User profile picture">
                  <h3 class="profile-username text-center">${project.projectName} </h3>
                  <p class="text-muted text-center"><c:if test="${project.isPublic==false}">私密项目</c:if><c:if test="${project.isPublic==true}">公开项目</c:if></p>

                  <ul class="list-group list-group-unbordered">
                  	<li class="list-group-item">
                      <b>传感器数目</b> <a class="pull-right"> <span class="pull-right badge bg-blue">${project.sensingDeviceNum}</span></a>
                    </li>
                    <li class="list-group-item">
                      <b>控制器数目</b> <a class="pull-right"> <span class="pull-right badge bg-green">${project.controllingDeviceNum}</span></a>
                    </li>
                    <li class="list-group-item">
                      <b>创建时间</b> <a class="pull-right"><span class="pull-right badge bg-aqua">${project.createTime}</span></a>
                    </li>
                  </ul>

                  <a href="EditProject?projectid=${project.projectId}" class="btn btn-primary btn-block"><b>编辑</b></a>
                </div><!-- /.box-body -->
              </div>
            
              
            
            </div><!-- /.col -->
            
            <div class="col-md-9">
              <div class="nav-tabs-custom">
                <ul class="nav nav-tabs">
                  <li class="active"><a href="#activity" data-toggle="tab" aria-expanded="true">传感设备</a></li>
                  <li class=""><a href="#timeline" data-toggle="tab" aria-expanded="false">控制设备</a></li>
                  <li class=""><a href="#sensing" data-toggle="tab" aria-expanded="false">最新传感数据</a></li>
                  <li class=""><a href="#control" data-toggle="tab" aria-expanded="false">最新控制日志</a></li>
                </ul>
                <div class="tab-content">
                  <div class="tab-pane active" id="activity">
                  
                  <div class="box-body" style="display: block;">
                  <div class="table-responsive">
                    <table class="table no-margin">
                      <thead>
                        <tr>
                          <th>#</th>
                          <th>设备名称</th>
                          <th>DeviceKey</th>
                          <th>设备地点</th>
                          <th>操作</th>
                        </tr>
                      </thead>
                      <tbody>
                        <tr>
                          <td><a href="pages/examples/invoice.html">1</a></td>
                          <td>温度传感器1</td>
                          <td>dfsdfsafdsfdsgfhgfjjugf</td>
                          <td><span class="label label-success">科研楼一楼</span></td>
                          <td>
                          	<a href="#"><i class="fa fa-fw fa-search"></i></a>
                    		<a href="#"><i class="fa fa-fw fa-edit"></i></a>
                    		<a href="#"  data-toggle="modal" data-target="#delete-sensingdevice-1"><i class="fa fa-fw fa-remove"></i></a>
                    		
                    		                    		
                    	
                     <div class="modal modal-danger" id="delete-sensingdevice-1" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                         <div class="modal-content">
                           <div class="modal-header">
                             <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                              <h4 class="modal-title">传感器删除</h4>
                            </div>
                            <div class="modal-body">
                             <p>您目前正在删除传感器“xxxx”，请确定是否删除？</p>
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
                  <a href="#" class="btn btn-sm btn-info btn-flat pull-right"  data-toggle="modal" data-target="#add-sensingdevice">增加传感设备</a>
                  
                  
                  
                  
            <div class="modal" id="add-sensingdevice"  tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
              <div class="modal-dialog">
                <div class="modal-content">
                  <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                    <h4 class="modal-title">创建传感设备</h4>
                  </div>
                  <!-- form start -->
                <form role="form" method="post" action="AddSensingDevice">
                  <div class="box-body">
                    <div class="form-group">
                      <label for="exampleInputEmail1">设备名称</label>
                      <input type=text class="form-control" id="exampleInputEmail1" placeholder="输入控制器名称" name="devicename">
                    </div>
                    <div class="form-group">
                      <label for="exampleInputEmail1">Mac地址</label>
                      <input type=text class="form-control" id="exampleInputEmail1" placeholder="输入Mac地址" name="mac">
                    </div>
                    <div class="form-group">
                    	<label for="exampleInputEmail1">使用协议</label>
						<select class="form-control select2 select2-hidden-accessible" style="width: 100%;" tabindex="-1" aria-hidden="true" name="protocol">
                     	 <option selected="selected" value="HTTP">HTTP</option>
                     	 <option value="TCP">TCP</option>
                   	 	</select>
                    </div>
                    <div class="form-group">
                      <label for="exampleInputEmail1">描述</label>
                      <input type=text class="form-control" id="exampleInputEmail1" placeholder="输入设备描述" name="description">
                    </div>
                    <div class="form-group">
                      <label for="exampleInputEmail1">地点</label>
                      <input type=text class="form-control" id="exampleInputEmail1" placeholder="输入设备地点" name="localtion">
                    </div>
                    <div class="form-group">
                      <label for="exampleInputEmail1">设备Key</label>
                      <input type=text class="form-control" id="exampleInputEmail2" placeholder="输入设备标识符" name="deviceKey">
                    </div>
                  </div><!-- /.box-body -->

                  <div class="box-footer">
                  	<input type="hidden" name="projectid" value="${project.projectId}">
                  	<button type="button" class="btn btn-default pull-left" data-dismiss="modal">关闭</button>
                    <button type="submit" class="btn btn-primary pull-right">创建</button>
                  </div>
                </form>
                </div><!-- /.modal-content -->
              </div><!-- /.modal-dialog -->
            </div><!-- /.modal -->
            
            
                  
                  
                </div><!-- /.box-footer -->
                  </div><!-- /.tab-pane -->
                  
                  
                  <div class="tab-pane" id="timeline">
                <div class="box-body" style="display: block;">
                  <div class="table-responsive">
                    <table class="table no-margin">
                      <thead>
                        <tr>
                          <th>#</th>
                          <th>设备名称</th>
                          <th>DeviceKey</th>
                          <th>设备地点</th>
                          <th>操作</th>
                        </tr>
                      </thead>
                      <tbody>
                        <tr>
                          <td><a href="pages/examples/invoice.html">1</a></td>
                          <td>温度传感器1</td>
                          <td>dfsdfsafdsfdsgfhgfjjugf</td>
                          <td><span class="label label-success">科研楼一楼</span></td>
                          <td>
                          	<a href="#"><i class="fa fa-fw fa-search"></i></a>
                    		<a href="#"><i class="fa fa-fw fa-edit"></i></a>
                    		<a href="#"  data-toggle="modal" data-target="#delete-sensingdevice-1"><i class="fa fa-fw fa-remove"></i></a>
                    		
                    		                    		
                    	
                     <div class="modal modal-danger" id="delete-sensingdevice-1" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                         <div class="modal-content">
                           <div class="modal-header">
                             <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                              <h4 class="modal-title">传感器删除</h4>
                            </div>
                            <div class="modal-body">
                             <p>您目前正在删除传感器“xxxx”，请确定是否删除？</p>
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
                 <a href="#" class="btn btn-sm btn-info btn-flat pull-right" data-toggle="modal" data-target="#add-controllingdevice">增加控制设备</a>
                                    
                  
                  
                  
            <div class="modal" id="add-controllingdevice"  tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
              <div class="modal-dialog">
                <div class="modal-content">
                  <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                    <h4 class="modal-title">创建控制设备</h4>
                  </div>
                  <!-- form start -->
                <form role="form" method="post" action="AddControllingDevice">
                  <div class="box-body">
                    <div class="form-group">
                      <label for="exampleInputEmail1">设备名称</label>
                      <input type=text class="form-control" id="exampleInputEmail1" placeholder="输入控制器名称" name="devicename">
                    </div>
                    <div class="form-group">
                      <label for="exampleInputEmail1">Mac地址</label>
                      <input type=text class="form-control" id="exampleInputEmail1" placeholder="输入Mac地址" name="mac">
                    </div>
                    <div class="form-group">
                    	<label for="exampleInputEmail1">使用协议</label>
						<select class="form-control select2 select2-hidden-accessible" style="width: 100%;" tabindex="-1" aria-hidden="true" name="protocol">
                     	 <option selected="selected" value="HTTP">HTTP</option>
                     	 <option value="TCP">TCP</option>
                   	 	</select>
                    </div>
                    <div class="form-group">
                      <label for="exampleInputEmail1">描述</label>
                      <input type=text class="form-control" id="exampleInputEmail1" placeholder="输入设备描述" name="description">
                    </div>
                    <div class="form-group">
                      <label for="exampleInputEmail1">地点</label>
                      <input type=text class="form-control" id="exampleInputEmail1" placeholder="输入设备地点" name="localtion">
                    </div>
                    <div class="form-group">
                      <label for="exampleInputEmail1">设备Key</label>
                      <input type=text class="form-control" id="exampleInputEmail2" placeholder="输入设备标识符" name="deviceKey">
                    </div>
                  </div><!-- /.box-body -->

                  <div class="box-footer">
                  	<input type="hidden" name="projectid" value="${project.projectId}"> 
                  	<button type="button" class="btn btn-default pull-left" data-dismiss="modal">关闭</button>
                    <button type="submit" class="btn btn-primary pull-right">创建</button>
                  </div>
                </form>
                </div><!-- /.modal-content -->
              </div><!-- /.modal-dialog -->
            </div><!-- /.modal -->
            
            
                  
                  
                </div><!-- /.box-footer -->
                  </div><!-- /.tab-pane -->
                  
                <div class="tab-pane" id="sensing">
                <div class="box-body" >
                  <table  class="table no-margin">
                    <tbody><tr>
                      <th style="width: 10px">#</th>
                      <th>设备</th>
                      <th>数据</th>
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
                  
                  <div class="tab-pane" id="control">
					<div class="box-body">
                  <table  class="table no-margin">
                    <tbody><tr>
                      <th style="width: 10px">#</th>
                      <th>设备</th>
                      <th>指令</th>
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
            
          </div><!-- /.row -->
        </section>
        
      </div>

      <jsp:include page="template/footer.jsp" flush="true"/><!--动态包含footer-->  