  <%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
 
	<jsp:include page="template/header.jsp" flush="true"/><!--动态包含header-->


	<div class="content-wrapper" style="min-height: 916px;">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
            	传感设备修改
            <small>在此页面修改传感设备详细信息</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="index.jsp"><i class="fa fa-dashboard"></i> 首页</a></li>
            <li><a href="SensingDeviceProfile.jsp">传感设备管理</a></li>
            <li class="active">传感设备修改</li>
          </ol>
        </section>

        <!-- Main content -->
        <section class="content">
        <div class="row">
            <!-- left column -->
            <div class="col-md-12">
              <!-- general form elements -->
              <div class="box box-primary">
                <div class="box-header with-border">
                  <h3 class="box-title">基本信息修改</h3>
                </div><!-- /.box-header -->
                <!-- form start -->
                <form role="form" method="post" action="">
                  <div class="box-body">
                    <div class="form-group">
                      <label for="exampleInputEmail1">传感器名称</label>
                      <input type=text class="form-control" id="exampleInputEmail1" placeholder="输入项目名称">
                    </div>
                    <div class="form-group">
                      <label for="exampleInputEmail1">Mac地址</label>
                      <input type=text class="form-control" id="exampleInputEmail1" placeholder="输入项目名称">
                    </div>
                    <div class="form-group">
                    	<label for="exampleInputEmail1">使用协议</label>
						<select class="form-control select2 select2-hidden-accessible" style="width: 100%;" tabindex="-1" aria-hidden="true">
                     	 <option selected="selected">HTTP</option>
                     	 <option>TCP</option>
                   	 	</select>
                    </div>
                    <div class="form-group">
                      <label for="exampleInputEmail1">描述</label>
                      <input type=text class="form-control" id="exampleInputEmail1" placeholder="输入项目名称">
                    </div>
                    <div class="form-group">
                      <label for="exampleInputEmail1">地点</label>
                      <input type=text class="form-control" id="exampleInputEmail1" placeholder="输入项目名称">
                    </div>
                    <div class="form-group">
                      <label for="exampleInputEmail1">设备Key</label>
                      <input type=text disabled="disabled" class="form-control" id="exampleInputEmail2" placeholder="输入项目Key" value="dfsfsaf">
                    </div>
                  </div><!-- /.box-body -->

                  <div class="box-footer">
                    <button type="submit" class="btn btn-primary">修改</button>
                  </div>
                </form>
              </div><!-- /.box -->

            </div>
            
          </div>
          
          </section>
      </div>

      <jsp:include page="template/footer.jsp" flush="true"/><!--动态包含footer-->  