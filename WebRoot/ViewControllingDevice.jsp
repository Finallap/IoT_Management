  <%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
	<jsp:include page="template/header.jsp" flush="true"/><!--动态包含header-->


	<div class="content-wrapper" style="min-height: 916px;">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
            	控制设备详情
            <small>在此页面查看控制设备详细信息</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="index"><i class="fa fa-dashboard"></i>首页</a></li>
            <li><a href="ControllingDeviceProfile?currentPage=1">控制设备管理</a></li>
            <li class="active">控制设备详情</li>
          </ol>
        </section>

        <!-- Main content -->
        <section class="content">
		<div class="row">
            <div class="col-md-3">

              <!-- Profile Image -->
              <div class="box box-primary">
                <div class="box-body box-profile">
                  <img class="profile-user-img img-responsive img-circle" src="dist/img/ControllingDevice -160x160.jpg" alt="User profile picture">
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

                  <a href="EditControllingDevice?deviceid=${device.controllingDeviceId}" class="btn btn-primary btn-block"><b>编辑</b></a>
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
                  <li class="active"><a href="#activity" data-toggle="tab" aria-expanded="true">控制项目</a></li>
                  <li class=""><a href="#timeline" data-toggle="tab" aria-expanded="false">最近日志</a></li>
                  <li class=""><a href="#control" data-toggle="tab" aria-expanded="false">发起控制</a></li>
                </ul>
                <div class="tab-content">
                  <div class="tab-pane active" id="activity">
                  <div class="box-body" style="display: block;">
                  <div class="table-responsive">
                    <table class="table no-margin">
                      <thead>
                        <tr>
                          <th>#</th>
                          <th>控制项目名称</th>
                          <th>控制项目标识</th>
                          <th>操作</th>
                        </tr>
                      </thead>
                      <tbody>
                      	<c:forEach var="ConfigType" items="${requestScope.ConfigTypeList}" varStatus="status">
                        <tr>
                          <td><a href="#"> ${status.count}</a></td>
                          <td>${ConfigType.configTypeName}</td>
                          <td>${ConfigType.mark}</td>
                          <td>
                    		<a href="#" data-toggle="modal" data-target="#edit-datatype-${ConfigType.configTypeId}"><i class="fa fa-fw fa-edit"></i></a>
                    		
                    		
            <div class="modal" id="edit-datatype-${ConfigType.configTypeId}"  tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
              <div class="modal-dialog">
                <div class="modal-content">
                  <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                    <h4 class="modal-title">修改控制项目</h4>
                  </div>
                  <form role="form" method="post" action="EditConfigType">
                  	<div class="modal-body">
                    	<div class="form-group">
                      		<label for="exampleInputEmail1">控制项目名称</label>
                      		<input type=text class="form-control" id="exampleInputEmail1" placeholder="输入控制项目名称" name="typename" value="${ConfigType.configTypeName}">
                    	</div>
                    	<div class="form-group">
                     		<label for="exampleInputEmail1">控制项目标识</label>
                      		<input type=text class="form-control" id="exampleInputEmail2" placeholder="输入控制项目标识" name="mark" value="${ConfigType.mark}">
                  		</div>
                  	</div><!-- /.box-body -->
                  	<div class="modal-footer">
                    	<button type="button" class="btn btn-default pull-left" data-dismiss="modal">关闭</button>
                    	<input type="hidden" name="typeid" value="${ConfigType.configTypeId}"> 
                        <input type="hidden" name="deviceid" value="${device.controllingDeviceId}"> 
                    	<button type="submit" class="btn btn-primary">修改</button>
                  	</div>
                  </form>
                </div><!-- /.modal-content -->
              </div><!-- /.modal-dialog -->
            </div><!-- /.modal -->
            
            
                    		
                    		<a href="#"  data-toggle="modal" data-target="#delete-datatype-${ConfigType.configTypeId}"><i class="fa fa-fw fa-remove"></i></a>
                    		
                    		                    		
                    	
                     <div class="modal modal-danger" id="delete-datatype-${ConfigType.configTypeId}" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                         <div class="modal-content">
                           <div class="modal-header">
                             <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                              <h4 class="modal-title">设备删除</h4>
                            </div>
                            <div class="modal-body">
                             <p>您目前正在删除控制项目“${ConfigType.configTypeName}”</p>
                             <p>（删除控制项目会将该项目有关的所有日志全部删除，请慎重操作）</p>
                             <p>请确定是否删除？ </p>
                            </div>
                           <div class="modal-footer">
                           	  <form method="post" action="DeleteConfigType">
                              	<button type="button" class="btn btn-outline pull-left" data-dismiss="modal">否</button>
                              	<input type="hidden" name="typeid" value="${ConfigType.configTypeId}"> 
                              	<input type="hidden" name="deviceid" value="${device.controllingDeviceId}"> 
                              	<button type="submit" class="btn btn-outline">删除</button>
                              </form>
                            </div>
                          </div><!-- /.modal-content -->
                        </div><!-- /.modal-dialog -->
                      </div>
            
              		
                    		
                          </td>
                        </tr>
                       </c:forEach>

                      </tbody>
                    </table>
                  </div><!-- /.table-responsive -->
                </div><!-- /.box-body -->
                <div class="box-footer clearfix" style="display: block;">
                  <a href="#" class="btn btn-sm btn-info btn-flat pull-right" data-toggle="modal" data-target="#add-data-type">增加控制项目</a>
                  
                  
                  
            <div class="modal" id="add-data-type"  tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
              <div class="modal-dialog">
                <div class="modal-content">
                  <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                    <h4 class="modal-title">创建控制项目</h4>
                  </div>
                  <form role="form" method="post" action="AddConfigType">
                  	<div class="modal-body">
                    	<div class="form-group">
                      		<label for="exampleInputEmail1">控制项目名称</label>
                      		<input type=text class="form-control" id="exampleInputEmail1" placeholder="输入控制项目名称" name="typename">
                    	</div>
                    	<div class="form-group">
                     		<label for="exampleInputEmail1">控制项目标识</label>
                      		<input type=text class="form-control" id="exampleInputEmail2" placeholder="输入控制项目标识" name="mark">
                  		</div>
                  	</div><!-- /.box-body -->
                  	<div class="modal-footer">
                    	<button type="button" class="btn btn-default pull-left" data-dismiss="modal">关闭</button>
                    	<input type="hidden" name="deviceid" value="${device.controllingDeviceId}"> 
                    	<button type="submit" class="btn btn-primary">创建</button>
                  	</div>
                  </form>
                </div><!-- /.modal-content -->
              </div><!-- /.modal-dialog -->
            </div><!-- /.modal -->

                  
                </div><!-- /.box-footer -->
                  </div><!-- /.tab-pane -->
                  
                  
                  <div class="tab-pane" id="timeline">
                  <div class="box-header with-border">
                  <h3 class="box-title">控制器最近二十条控制指令</h3>
                </div><!-- /.box-header -->
                <div class="box-body">
                  <table class="table table-bordered">
                    <tbody>
                    <tr>
                      <th>#</th>
                      <th>设备</th>
                      <th>控制项目</th>
                      <th>值</th>
                      <th>指令发出时间</th>
                    </tr>
                    <c:forEach var="ConfigLog" items="${requestScope.ConfigLogList}" varStatus="status">
                    <tr>
                      <td>${status.count}</td>
                      <td>${device.deviceName}</td>
                      <td>${ConfigLog.configTypeName}</td>
                      <td>${ConfigLog.configContent}</td>
                      <td>${ConfigLog.saveTime}</td>
                    </tr>
					</c:forEach>
                  </tbody></table>
                </div><!-- /.box-body -->
                  </div><!-- /.tab-pane -->
                  
                  <div class="tab-pane" id="control">
                <!-- form start -->
                <form role="form" method="post" action="">
                  <div class="box-body">
                    <div class="form-group">
                      <label for="exampleInputEmail1">项目名称</label>
                      <input type=text class="form-control" id="exampleInputEmail1" placeholder="输入项目名称">
                    </div>
                    <div class="form-group">
                      <label for="exampleInputEmail1">项目Key</label>
                      <input type=text class="form-control" id="exampleInputEmail2" placeholder="输入项目Key">
                    </div>
                  </div><!-- /.box-body -->

                  <div class="box-footer">
                    <button type="submit" class="btn btn-primary">发起控制指令</button>
                    <br><br>
                    <label for="exampleInputEmail1">（注：若想不发起某些项控制，则相应的框空白即可。）</label>
                  </div>
                </form>

                  </div><!-- /.tab-pane -->
                  
                </div><!-- /.tab-content -->
              </div><!-- /.nav-tabs-custom -->
            </div><!-- /.col -->
          </div>
          
          <!-- Main row -->
        </section>
        
      </div>

      <jsp:include page="template/footer.jsp" flush="true"/><!--动态包含footer-->  