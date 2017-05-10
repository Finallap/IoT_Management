  <%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
	<jsp:include page="template/header.jsp" flush="true"/><!--动态包含header-->


	<div class="content-wrapper" style="min-height: 916px;">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
            	控制设备修改
            <small>在此页面修改控制设备详细信息</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="index"><i class="fa fa-dashboard"></i> 首页</a></li>
            <li><a href="ControllingDeviceProfile?currentPage=1">控制设备管理</a></li>
            <li class="active">控制设备修改</li>
          </ol>
        </section>

        <!-- Main content -->
        <section class="content">
        	<div class="alert alert-info alert-dismissable">
                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
                    <h4><i class="icon fa fa-info"></i>提示：</h4>
                    <p>"控制项目"的增加、修改、删除在项目相应的查看设备详情页！</p>
            </div>
        <div class="row">
            <!-- left column -->
            <div class="col-md-12">
              <!-- general form elements -->
              <div class="box box-primary">
                <div class="box-header with-border">
                  <h3 class="box-title">基本信息修改</h3>
                </div><!-- /.box-header -->
                <!-- form start -->
                <form role="form" method="post" action="EditControllingDevice">
                  <div class="box-body">
                    <div class="form-group">
                      <label for="exampleInputEmail1">控制器名称</label>
                      <input type=text class="form-control" id="exampleInputEmail1" placeholder="输入控制器名称" value="${device.deviceName}" name="devicename">
                    </div>
                    <div class="form-group">
                      <label for="exampleInputEmail1">Mac地址</label>
                      <input type=text class="form-control" id="exampleInputEmail1" placeholder="输入Mac地址" value="${device.mac}" name="mac">
                    </div>
                    <div class="form-group">
                    	<label for="exampleInputEmail1">使用协议</label>
						<select class="form-control select2 select2-hidden-accessible" style="width: 100%;" tabindex="-1" aria-hidden="true" name="protocol">
                     	 <option <c:if test="${device.protocol=='HTTP'}">selected="selected"</c:if> value="HTTP">HTTP</option>
                     	 <option <c:if test="${device.protocol=='TCP'}">selected="selected"</c:if> value="TCP">TCP</option>
                   	 	</select>
                    </div>
                    <div class="form-group">
                      <label for="exampleInputEmail1">描述</label>
                      <input type=text class="form-control" id="exampleInputEmail1" placeholder="输入设备描述" value="${device.description}" name="description">
                    </div>
                    <div class="form-group">
                      <label for="exampleInputEmail1">地点</label>
                      <input type=text class="form-control" id="exampleInputEmail1" placeholder="输入设备地点" value="${device.localtion}" name="localtion">
                    </div>
                    <div class="form-group">
                      <label for="exampleInputEmail1">设备Key</label>
                      <input type=text class="form-control" id="exampleInputEmail2" placeholder="输入设备标识符" value="${device.deviceKey}" name="deviceKey">
                    </div>
                  </div><!-- /.box-body -->

                  <div class="box-footer">
                  	<input type="hidden" name="deviceid" value="${device.controllingDeviceId}">
                    <button type="submit" class="btn btn-primary">修改</button>
                  </div>
                </form>
              </div><!-- /.box -->

            </div>
            
          </div>
          
          </section>
      </div>

      <jsp:include page="template/footer.jsp" flush="true"/><!--动态包含footer-->  