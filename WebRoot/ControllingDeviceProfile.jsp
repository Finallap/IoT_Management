	<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
	<jsp:include page="template/header.jsp" flush="true"/><!--动态包含header-->

	<div class="content-wrapper" style="min-height: 916px;">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
            	控制设备管理
            <small>进行控制设备的增加、修改、查看</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="index.jsp"><i class="fa fa-dashboard"></i> 首页</a></li>
            <li class="active">控制设备管理</li>
          </ol>
        </section>

        <!-- Main content -->
        <section class="content">
        
        <div class="row">
            <div class="col-xs-12">
              <div class="box">
                <div class="box-header">
                  <h3 class="box-title">控制设备总表</h3>
                </div><!-- /.box-header -->
                <div class="box-body">
                  <div id="example2_wrapper" class="dataTables_wrapper form-inline dt-bootstrap"><div class="row"><div class="col-sm-6"></div><div class="col-sm-6"></div></div><div class="row"><div class="col-sm-12"><table id="example2" class="table table-bordered table-hover dataTable" role="grid" aria-describedby="example2_info">
                    <thead>
                      <tr role="row">
                      	<th class="sorting_asc" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Rendering engine: activate to sort column descending">#</th>
                      	<th class="sorting_asc" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Rendering engine: activate to sort column descending">控制器名称</th>
                      	<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Browser: activate to sort column ascending">所属项目</th>
                      	<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Platform(s): activate to sort column ascending">Mac地址</th>
                      	<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Engine version: activate to sort column ascending">地点</th>
                      	<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Engine version: activate to sort column ascending">控制项目总数</th>
                      	<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="CSS grade: activate to sort column ascending">控制操作</th>
                      	<th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="CSS grade: activate to sort column ascending">设备操作</th>
                      </tr>
                    </thead>
                    <tbody>
                    
                    <c:forEach var="ControllingDevice" items="${requestScope.pagebean.contentData }">
                    <tr role="row" class="odd">
                    	<td>1</td>
                        <td class="sorting_1">${ControllingDevice.deviceName}</td>
                        <td>${ControllingDevice.projectName}</td>
                        <td>${ControllingDevice.mac}</td>
                        <td>${ControllingDevice.localtion}</td>
                        <td><span class="badge bg-green">3</span></td>
                        <td>
                    		<a href="ViewControllingDevice.jsp?deviceid=${ControllingDevice.controllingDeviceId}"><i class="fa fa-fw fa-wrench"></i>控制发起</a>
                    		<a href="LogView.jsp"><i class="fa fa-fw fa-print"></i>日志</a>
						</td>
                        <td>
                    		<a href="ViewControllingDevice.jsp?deviceid=${ControllingDevice.controllingDeviceId}"><i class="fa fa-fw fa-search"></i>查看</a>
                    		<a href="EditControllingDevice.jsp?deviceid=${ControllingDevice.controllingDeviceId}"><i class="fa fa-fw fa-edit"></i>编辑</a>
                    		<a href="#"  data-toggle="modal" data-target="#delete-controllingdevice-${ControllingDevice.controllingDeviceId}"><i class="fa fa-fw fa-remove"></i>删除</a>
                    		
                    		                    		
                    	
                     <div class="modal modal-danger" id="delete-controllingdevice-${ControllingDevice.controllingDeviceId}" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                         <div class="modal-content">
                           <div class="modal-header">
                             <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                              <h4 class="modal-title">控制设备删除</h4>
                            </div>
                            <div class="modal-body">
                             <p>您目前正在删除控制设备“${ControllingDevice.deviceName}”</p>
                             <p>（删除设备会将所包含的数据全部删除，请慎重操作）</p>
                             <p>请确定是否删除？ </p>
                            </div>
                           <div class="modal-footer">
                           	  <form method="post" action="DeleteControllingDevice">
                              	<button type="button" class="btn btn-outline pull-left" data-dismiss="modal">否</button>
                              	<input type="hidden" name="deviceid" value="${ControllingDevice.deviceName}"> 
                              	<button type="submit" class="btn btn-outline">删除</button>
                              </form>
                            </div>
                          </div><!-- /.modal-content -->
                        </div><!-- /.modal-dialog -->
                      </div>
            
              		
                    		
						</td>
                      </tr>
                      </c:forEach>
                      
                      <tr role="row" class="even">
                      	<td>1</td>
                        <td class="sorting_1">Gecko</td>
                        <td>Firefox 1.5</td>
                        <td>Win 98+ / OSX.2+</td>
                        <td>1.8</td>
                        <td><span class="badge bg-green">3</span></td>
                        <td>
                    		<a href="#"><i class="fa fa-fw fa-wrench"></i>控制发起</a>
                    		<a href="#"><i class="fa fa-fw fa-print"></i>日志</a>
						</td>
                        <td>
                    		<a href="#"><i class="fa fa-fw fa-search"></i>查看</a>
                    		<a href="#"><i class="fa fa-fw fa-edit"></i>编辑</a>
                    		<a href="#"><i class="fa fa-fw fa-remove"></i>删除</a>
						</td>
                      </tr><tr role="row" class="odd">
                      	<td>1</td>
                        <td class="sorting_1">Gecko</td>
                        <td>Firefox 2.0</td>
                        <td>Win 98+ / OSX.2+</td>
                        <td>1.8</td>
                        <td><span class="badge bg-green">3</span></td>
                        <td>
                    		<a href="#"><i class="fa fa-fw fa-wrench"></i>控制发起</a>
                    		<a href="#"><i class="fa fa-fw fa-print"></i>日志</a>
						</td>
                        <td>
                    		<a href="#"><i class="fa fa-fw fa-search"></i>查看</a>
                    		<a href="#"><i class="fa fa-fw fa-edit"></i>编辑</a>
                    		<a href="#"><i class="fa fa-fw fa-remove"></i>删除</a>
						</td>
                      </tr><tr role="row" class="even">
                      	<td>1</td>
                        <td class="sorting_1">Gecko</td>
                        <td>Firefox 3.0</td>
                        <td>Win 2k+ / OSX.3+</td>
                        <td>1.9</td>
                        <td><span class="badge bg-green">3</span></td>
                        <td>
                    		<a href="#"><i class="fa fa-fw fa-wrench"></i>控制发起</a>
                    		<a href="#"><i class="fa fa-fw fa-print"></i>日志</a>
						</td>
                        <td>
                    		<a href="#"><i class="fa fa-fw fa-search"></i>查看</a>
                    		<a href="#"><i class="fa fa-fw fa-edit"></i>编辑</a>
                    		<a href="#"><i class="fa fa-fw fa-remove"></i>删除</a>
						</td>
                      </tr>
                      </tbody>
                  </table></div></div>
                  
                  
                  	<div class="row">
                  		<div class="col-sm-5">
                  			<div class="dataTables_info" id="example2_info" role="status" aria-live="polite">共搜索到${pagebean.totalRecords}条符合条件的数据</div>
                  		</div>
                  		<div class="col-sm-7">
                  			<div class="dataTables_paginate paging_simple_numbers" id="example2_paginate">
                  				<ul class="pagination">
                  					<li class="paginate_button previous disabled" id="example2_previous"><a href="javascript:void(0)" onclick="gotopage(${pagebean.previousPage})" aria-controls="example2" data-dt-idx="0" tabindex="0">上一页</a></li>
                  					<li class="paginate_button active"><a href="#" aria-controls="example2" data-dt-idx="1" tabindex="0">1</a></li>
                  					<li class="paginate_button "><a href="#" aria-controls="example2" data-dt-idx="2" tabindex="0">2</a></li>
                  					<li class="paginate_button "><a href="#" aria-controls="example2" data-dt-idx="3" tabindex="0">3</a></li>
                  					<li class="paginate_button "><a href="#" aria-controls="example2" data-dt-idx="4" tabindex="0">4</a></li>
                  					<li class="paginate_button "><a href="#" aria-controls="example2" data-dt-idx="5" tabindex="0">5</a></li>
                  					<li class="paginate_button "><a href="#" aria-controls="example2" data-dt-idx="6" tabindex="0">6</a></li>
                  					<li class="paginate_button next" id="example2_next"><a href="javascript:void(0)" onclick="gotopage(${pagebean.nextPage})" aria-controls="example2" data-dt-idx="7" tabindex="0">下一页</a></li>
                  					<c:choose>  
                        				<c:when test="${pageBean.currentPage==1}">  
                           					 首页  
                           					 上一页  
                            				<a href="javascript:toPage(${pageBean.currentPage+1})">下一页</a>  
                           					<a href="javascript:toPage(${pageBean.totalPage})">最后一页</a>  
                        				</c:when>  
                        				<c:when test="${pageBean.currentPage==pageBean.totalPage}">  
                            				<a href="javascript:toPage(1)">首页</a>  
                            				<a href="javascript:toPage(${pageBean.currentPage-1})">上一页</a>  
                            				下一页  
                            				最后一页  
                        				</c:when>  
                        				<c:otherwise>  
                            				<a href="javascript:toPage(1)">首页</a>  
                            				<a href="javascript:toPage(${pageBean.currentPage-1})">上一页</a>  
                            				<a href="javascript:toPage(${pageBean.currentPage+1})">下一页</a>  
                            				<a href="javascript:toPage(${pageBean.totalPage})">最后一页</a>  
                        				</c:otherwise>  
                    				</c:choose>  
                  				</ul>
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
           location.href='ControllingDeviceProfile'+num;
        }     
    </script>
	
    <jsp:include page="template/footer.jsp" flush="true"/><!--动态包含footer-->  