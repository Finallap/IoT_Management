  <%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
	<jsp:include page="template/header.jsp" flush="true"/><!--动态包含header-->


	<div class="content-wrapper" style="min-height: 916px;">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
            	感应设备管理
            <small>进行感应设备的增加、修改、查看</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="index.jsp"><i class="fa fa-dashboard"></i> 首页</a></li>
            <li class="active">感应设备管理</li>
          </ol>
        </section>

        <!-- Main content -->
        <section class="content">
        
        <div class="row">
            <div class="col-xs-12">
              <div class="box">
                <div class="box-header">
                  <h3 class="box-title">感应设备总表</h3>
                </div><!-- /.box-header -->
                <div class="box-body">
                  <div id="example2_wrapper" class="dataTables_wrapper form-inline dt-bootstrap"><div class="row"><div class="col-sm-6"></div><div class="col-sm-6"></div></div><div class="row"><div class="col-sm-12"><table id="example2" class="table table-bordered table-hover dataTable" role="grid" aria-describedby="example2_info">
                    <thead>
                      <tr role="row">
                      	<th class="sorting_asc" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Rendering engine: activate to sort column descending">#</th>
                      	<th class="sorting_asc" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Rendering engine: activate to sort column descending">传感器名称</th>
                      	<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Browser: activate to sort column ascending">所属项目</th>
                      	<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Platform(s): activate to sort column ascending">Mac地址</th>
                      	<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Engine version: activate to sort column ascending">地点</th>
                      	<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Engine version: activate to sort column ascending">数据类型总数</th>
                      	<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="CSS grade: activate to sort column ascending">数据操作</th>
                      	<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="CSS grade: activate to sort column ascending">设备操作</th>
                      </tr>
                    </thead>
                    <tbody>
                     
                    
                    <c:forEach var="SensingDevice" items="${requestScope.pagebean.contentData}" varStatus="status">
                    <tr role="row" class="odd">
                    	<td>${status.count}</td>
                        <td class="sorting_1">${SensingDevice.deviceName}</td>
                        <td>${SensingDevice.projectName}</td>
                        <td>${SensingDevice.mac}</td>
                        <td>${SensingDevice.localtion}</td>
                        <td><span class="badge bg-green">${SensingDevice.typeCount}</span></td>
                        <td>
                    		<a href="DataView.jsp"><i class="fa fa-fw fa-upload"></i>数据查看导出</a>
						</td>
                        <td>
                    		<a href="ViewSensingDevice?deviceid=${SensingDevice.sensingDeviceId}"><i class="fa fa-fw fa-search"></i>查看</a>
                    		<a href="EditSensingDevice?deviceid=${SensingDevice.sensingDeviceId}"><i class="fa fa-fw fa-edit"></i>编辑</a>
                    		<a href="#"  data-toggle="modal" data-target="#delete-sensingdevice-${SensingDevice.sensingDeviceId}"><i class="fa fa-fw fa-remove"></i>删除</a>
                    		
                    		                    		
                    	
                     <div class="modal modal-danger" id="delete-sensingdevice-${SensingDevice.sensingDeviceId}" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                         <div class="modal-content">
                           <div class="modal-header">
                             <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                              <h4 class="modal-title">设备删除</h4>
                            </div>
                            <div class="modal-body">
                             <p>您目前正在删除控制设备“${SensingDevice.deviceName}”</p>
                             <p>（删除设备会将所包含的数据全部删除，请慎重操作）</p>
                             <p>请确定是否删除？ </p>
                            </div>
                           <div class="modal-footer">
                           	  <form method="post" action="DeleteSensingDevice">
                              	<button type="button" class="btn btn-outline pull-left" data-dismiss="modal">否</button>
                              	<input type="hidden" name="deviceid" value="${SensingDevice.sensingDeviceId}"> 
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
            </div><!-- /.col -->
          </div>
        
        </section><!-- /.content -->
      </div>
      
    <script type="text/javascript">  
        function toPage(num){  
           location.href='SensingDeviceProfile?currentPage='+num;
        }     
    </script>
	
    <jsp:include page="template/footer.jsp" flush="true"/><!--动态包含footer-->  