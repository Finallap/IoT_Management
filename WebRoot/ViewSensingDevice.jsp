  <%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
  <% String[] bg ={"bg-aqua","bg-green","bg-yellow","bg-red"};%>
 
	<jsp:include page="template/header.jsp" flush="true"/><!--动态包含header-->


	<div class="content-wrapper" style="min-height: 916px;">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
            	传感设备详情
            <small>在此页面查看传感设备详细信息</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="index"><i class="fa fa-dashboard"></i>首页</a></li>
            <li><a href="SensingDeviceProfile?currentPage=1">传感设备管理</a></li>
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
                  <li class=""><a href="#rule" data-toggle="tab" aria-expanded="false">告警规则</a></li>
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
                          <th>传感器标记</th>
                          <th>数据</th>
                          <th>操作</th>
                        </tr>
                      </thead>
                      <tbody>
                      <c:forEach var="DataType" items="${requestScope.DataTypeList}" varStatus="status">
                        <tr>
                          <td><a href="#"> ${status.count}</a></td>
                          <td>${DataType.type}</td>
                          <td>${DataType.symbol}</td>
                          <td>${DataType.mark}</td>
                          <td>
							<a href="#"><i class="fa fa-fw fa-upload"></i>查看导出</a>
						  </td>
                          <td>
                    		<a href="#" data-toggle="modal" data-target="#edit-datatype-${DataType.dataTypeId}"><i class="fa fa-fw fa-edit"></i></a>
                    		
                    		
            <div class="modal" id="edit-datatype-${DataType.dataTypeId}"  tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
              <div class="modal-dialog">
                <div class="modal-content">
                  <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                    <h4 class="modal-title">修改数据类型</h4>
                  </div>
                  <form role="form" method="post" action="EditDataType">
                  	<div class="modal-body">
                    	<div class="form-group">
                      		<label for="exampleInputEmail1">数据类型名称</label>
                      		<input type=text class="form-control" id="exampleInputEmail1" placeholder="输入数据类型名称" name="typename" value="${DataType.type}">
                    	</div>
                    	<div class="form-group">
                     		<label for="exampleInputEmail1">数据单位</label>
                      		<input type=text class="form-control" id="exampleInputEmail2" placeholder="输入数据单位" name="symbol" value="${DataType.symbol}">
                  		</div>
                  		<div class="form-group">
                     		<label for="exampleInputEmail1">传感器标记</label>
                      		<input type=text class="form-control" id="exampleInputEmail2" placeholder="输入传感设备对于本数据的标记" name="mark" value="${DataType.mark}">
                  		</div>
                  	</div><!-- /.box-body -->
                  	<div class="modal-footer">
                    	<button type="button" class="btn btn-default pull-left" data-dismiss="modal">关闭</button>
                    	<input type="hidden" name="typeid" value="${DataType.dataTypeId}"> 
                        <input type="hidden" name="deviceid" value="${device.sensingDeviceId}"> 
                    	<button type="submit" class="btn btn-primary">修改</button>
                  	</div>
                  </form>
                </div><!-- /.modal-content -->
              </div><!-- /.modal-dialog -->
            </div><!-- /.modal -->
            
            
                    		
                    		<a href="#"  data-toggle="modal" data-target="#delete-datatype-${DataType.dataTypeId}"><i class="fa fa-fw fa-remove"></i></a>
                    		
                    		                    		
                    	
                     <div class="modal modal-danger" id="delete-datatype-${DataType.dataTypeId}" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                         <div class="modal-content">
                           <div class="modal-header">
                             <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                              <h4 class="modal-title">设备删除</h4>
                            </div>
                            <div class="modal-body">
                             <p>您目前正在删除数据类型“${DataType.type}”</p>
                             <p>（删除类型会将所包含的数据全部删除，请慎重操作）</p>
                             <p>请确定是否删除？ </p>
                            </div>
                           <div class="modal-footer">
                           	  <form method="post" action="DeleteDataType">
                              	<button type="button" class="btn btn-outline pull-left" data-dismiss="modal">否</button>
                              	<input type="hidden" name="typeid" value="${DataType.dataTypeId}"> 
                              	<input type="hidden" name="deviceid" value="${device.sensingDeviceId}"> 
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
                  <a href="#" class="btn btn-sm btn-info btn-flat pull-right" data-toggle="modal" data-target="#add-data-type">增加数据类型</a>
                  
                  
                  
            <div class="modal" id="add-data-type"  tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
              <div class="modal-dialog">
                <div class="modal-content">
                  <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                    <h4 class="modal-title">创建数据类型</h4>
                  </div>
                  <form role="form" method="post" action="AddDataType">
                  	<div class="modal-body">
                    	<div class="form-group">
                      		<label for="exampleInputEmail1">数据类型名称</label>
                      		<input type=text class="form-control" id="exampleInputEmail1" placeholder="输入数据类型名称" name="typename">
                    	</div>
                    	<div class="form-group">
                     		<label for="exampleInputEmail1">数据单位</label>
                      		<input type=text class="form-control" id="exampleInputEmail2" placeholder="输入数据单位" name="symbol">
                  		</div>
                  		<div class="form-group">
                     		<label for="exampleInputEmail1">传感器标记</label>
                      		<input type=text class="form-control" id="exampleInputEmail2" placeholder="输入传感设备对于本数据的标记" name="mark">
                  		</div>
                  	</div><!-- /.box-body -->
                  	<div class="modal-footer">
                    	<button type="button" class="btn btn-default pull-left" data-dismiss="modal">关闭</button>
                    	<input type="hidden" name="deviceid" value="${device.sensingDeviceId}"> 
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
                  <h3 class="box-title">传感器最近二十条上传数据</h3>
                </div><!-- /.box-header -->
                <div class="box-body">
                  <table class="table table-bordered">
                    <tbody><tr>
                      <th>#</th>
                      <th>类型</th>
                      <th>符号</th>
                      <th>值</th>
                      <th>时间</th>
                    </tr>
                    <c:forEach var="DataLog" items="${requestScope.DataLogList}" varStatus="status">
                    <tr>
                      <td>${status.count}</td>
                      <td>${DataLog.type}</td>
                      <td>${DataLog.symbol}</td>
                      <td><span class="badge bg-green">${DataLog.value}</span></td>
                      <td>${DataLog.saveTime}</td>
                    </tr>
                    </c:forEach>
                  </tbody></table>
                </div><!-- /.box-body -->
                  </div><!-- /.tab-pane -->
                  
                  
                  <div class="tab-pane" id="rule">
                  <div class="box-body">
                  <div class="table-responsive">
                    <table class="table no-margin">
                      <thead>
                        <tr>
                          <th>#</th>
                          <th>告警数据类型</th>
                          <th>告警规则</th>
                          <th>阈值</th>
                          <th>操作</th>
                        </tr>
                      </thead>
                      <tbody>
                      <c:forEach var="AlarmRule" items="${requestScope.AlarmRuleList}" varStatus="status">
                        <tr>
                          <td><a href="#"> ${status.count}</a></td>
                          <td>${AlarmRule.dataTypeName}</td>
                          <td>${AlarmRule.rule}</td>
                          <td>${AlarmRule.threshold}</td>
                          <td>
                    		<a href="#" data-toggle="modal" data-target="#edit-alarmrule-${AlarmRule.alarmRuleID}"><i class="fa fa-fw fa-edit"></i></a>
                    		
                    		
            <div class="modal" id="edit-alarmrule-${AlarmRule.alarmRuleID}"  tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
              <div class="modal-dialog">
                <div class="modal-content">
                  <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                    <h4 class="modal-title">修改告警规则</h4>
                  </div>
                  <form role="form" method="post" action="EditAlarmRule">
                  	<div class="modal-body">
                  	
                  		<!--
                    	<div class="form-group">
                    		<label for="exampleInputEmail1">选择数据类型</label>
                    		<select id="type" name="typeid" class="form-control select2 select2-hidden-accessible"  style="width: 100%;" tabindex="-1" aria-hidden="true">
                    			<c:forEach var="DataType" items="${requestScope.DataTypeList}" varStatus="status">
                     	 			<option value="${DataType.dataTypeId}" <c:if test="${AlarmRule.dataTypeID==DataType.dataTypeId}"> selected="selected" </c:if> >${DataType.type}</option>
                     	 		</c:forEach>
                    		</select>
                   		</div>
                   		-->
                   		
                    	<div class="form-group">
                     		<label for="exampleInputEmail1">规则</label>
                      		<select id="rule" name="rule" class="form-control select2 select2-hidden-accessible"  style="width: 100%;" tabindex="-1" aria-hidden="true">
                     	 		<option value="=" <c:if test="${AlarmRule.rule=='='}"> selected="selected" </c:if> >=</option>
                     	 		<option value="&gt;" <c:if test="${AlarmRule.rule=='>'}"> selected="selected" </c:if> >&gt;</option>
                     	 		<option value="&lt;" <c:if test="${AlarmRule.rule=='<'}"> selected="selected" </c:if> >&lt;</option>
                     	 		
                     	 	</select>
                  		</div>
                  		<div class="form-group">
                     		<label for="exampleInputEmail1">阈值</label>
                      		<input type=text class="form-control" id="exampleInputEmail2" placeholder="输入传感设备对于本规则的阈值" name="threshold" value="${AlarmRule.threshold}">
                  		</div>
                  	</div><!-- /.box-body -->
                  	<div class="modal-footer">
                    	<button type="button" class="btn btn-default pull-left" data-dismiss="modal">关闭</button>
                    	<input type="hidden" name="alarmruleid" value="${AlarmRule.alarmRuleID}">
                    	<input type="hidden" name="deviceid" value="${device.sensingDeviceId}">  
                    	<button type="submit" class="btn btn-primary">修改</button>
                  	</div>
                  </form>
                </div><!-- /.modal-content -->
              </div><!-- /.modal-dialog -->
            </div><!-- /.modal -->
            
            
                    		
                    		<a href="#"  data-toggle="modal" data-target="#delete-datatype-${AlarmRule.alarmRuleID}"><i class="fa fa-fw fa-remove"></i></a>
                    		
                    		                    		
                    	
                     <div class="modal modal-danger" id="delete-datatype-${AlarmRule.alarmRuleID}" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                         <div class="modal-content">
                           <div class="modal-header">
                             <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                              <h4 class="modal-title">告警规则删除</h4>
                            </div>
                            <div class="modal-body">
                             <p>您目前正在删除告警规则“${DataType.type}”</p>
                             <p>（删除规则会将所包含的数据全部删除，请慎重操作）</p>
                             <p>请确定是否删除？ </p>
                            </div>
                           <div class="modal-footer">
                           	  <form method="post" action="DeleteAlarmRule">
                              	<button type="button" class="btn btn-outline pull-left" data-dismiss="modal">否</button>
                              	<input type="hidden" name="deviceid" value="${device.sensingDeviceId}"> 
                              	<input type="hidden" name="alarmruleid" value="${AlarmRule.alarmRuleID}"> 
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
                  <a href="#" class="btn btn-sm btn-info btn-flat pull-right" data-toggle="modal" data-target="#add-rule">增加告警规则</a>
                  
                  
                  
            <div class="modal" id="add-rule"  tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
              <div class="modal-dialog">
                <div class="modal-content">
                  <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                    <h4 class="modal-title">创建告警规则</h4>
                  </div>
                  <form role="form" method="post" action="AddAlarmRule">
                  	<div class="modal-body">
                    	<div class="form-group">
                    		<label for="exampleInputEmail1">选择数据类型</label>
                    		<select id="type" name="typeid" class="form-control select2 select2-hidden-accessible"  style="width: 100%;" tabindex="-1" aria-hidden="true">
                    			<c:forEach var="DataType" items="${requestScope.DataTypeList}" varStatus="status">
                     	 			<option value="${DataType.dataTypeId}">${DataType.type}</option>
                     	 		</c:forEach>
                    		</select>
                   		</div>
                    	<div class="form-group">
                     		<label for="exampleInputEmail1">规则</label>
                      		<select id="rule" name="rule" class="form-control select2 select2-hidden-accessible"  style="width: 100%;" tabindex="-1" aria-hidden="true">
                     	 		<option value="=">=</option>
                     	 		<option value="&gt;">&gt;</option>
                     	 		<option value="&lt;">&lt;</option>
                     	 	</select>
                  		</div>
                  		<div class="form-group">
                     		<label for="exampleInputEmail1">阈值</label>
                      		<input type=text class="form-control" id="exampleInputEmail2" placeholder="输入传感设备对于本规则的阈值" name="threshold">
                  		</div>
                  	</div><!-- /.box-body -->
                  	<div class="modal-footer">
                    	<button type="button" class="btn btn-default pull-left" data-dismiss="modal">关闭</button>
                    	<input type="hidden" name="deviceid" value="${device.sensingDeviceId}"> 
                    	<button type="submit" class="btn btn-primary">创建</button>
                  	</div>
                  </form>
                </div><!-- /.modal-content -->
              </div><!-- /.modal-dialog -->
            </div><!-- /.modal -->

                  
                </div><!-- /.box-footer -->
                  </div><!-- /.tab-pane -->
                  
                  
                  
                </div><!-- /.tab-content -->
              </div><!-- /.nav-tabs-custom -->
            </div><!-- /.col -->
          </div>
          
          <!-- Main row -->
        </section>
        
      </div>

      <jsp:include page="template/footer.jsp" flush="true"/><!--动态包含footer-->  