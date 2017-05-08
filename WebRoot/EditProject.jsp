  <%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
 
	<jsp:include page="template/header.jsp" flush="true"/><!--动态包含header-->


	<div class="content-wrapper" style="min-height: 916px;">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
            	项目修改
            <small>在此页面修改项目信息</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="index"><i class="fa fa-dashboard"></i> 首页</a></li>
            <li><a href="ProjectProfile">项目管理</a></li>
            <li class="active">项目修改</li>
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
                  <h3 class="box-title">项目修改</h3>
                </div><!-- /.box-header -->
                <!-- form start -->
                <form role="form" method="post" action="EditProject">
                  <div class="box-body">
                    <div class="form-group">
                      <label for="exampleInputEmail1">项目名称</label>
                      <input type=text class="form-control" id="exampleInputEmail1" placeholder="输入项目名称">
                    </div>
                    <div class="form-group">
                    	<label for="exampleInputEmail1">项目类型</label>
						<select class="form-control select2 select2-hidden-accessible" style="width: 100%;" tabindex="-1" aria-hidden="true">
                     	 <option selected="selected">公开</option>
                     	 <option>私密</option>
                   	 	</select>
                    </div>
                    <div class="form-group">
                      <label for="exampleInputEmail1">项目Key</label>
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