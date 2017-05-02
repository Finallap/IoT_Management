            <%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
 
	<jsp:include page="template/header.jsp" flush="true"/><!--动态包含header-->


	<div class="content-wrapper" style="min-height: 916px;">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
           	 项目管理
            <small>进行项目的增加、修改、查看</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="index.jsp"><i class="fa fa-dashboard"></i> 首页</a></li>
            <li class="active">项目管理</li>
          </ol>
        </section>

        <!-- Main content -->
        <section class="content">
        <div class="row">
            <div class="col-md-4">
              <!-- Widget: user widget style 1 -->
              <div class="box box-widget widget-user-2">
                <!-- Add the bg color to the header using any of the bg-* classes -->
                <div class="widget-user-header bg-yellow">
                  <div class="widget-user-image">
                    <img class="img-circle" src="dist/img/user7-128x128.jpg" alt="User Avatar">
                  </div><!-- /.widget-user-image -->
                  <h3 class="widget-user-username">南邮气象监控</h3>
                  <h5 class="widget-user-desc">公开项目</h5>
                </div>
                <div class="box-footer no-padding">
                  <ul class="nav nav-stacked">
                    <li><a href="#">传感器总数 <span class="pull-right badge bg-blue">31</span></a></li>
                    <li><a href="#">控制器总数 <span class="pull-right badge bg-aqua">5</span></a></li>
                    <li><a href="#">已上传数据<span class="pull-right badge bg-green">12</span></a></li>
                    <li>
                    	<a href="#" class="pull-right"  data-toggle="modal" data-target="#delete-project-1"><i class="fa fa-fw fa-remove"></i>删除</a>
                    	
                    	
                    	
                     <div class="modal modal-danger"  id="delete-project-1" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                         <div class="modal-content">
                           <div class="modal-header">
                             <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                              <h4 class="modal-title">项目删除</h4>
                            </div>
                            <div class="modal-body">
                             <p>您目前正在删除项目“xxxx”，请确定是否删除？</p>
                            </div>
                           <div class="modal-footer">
                              <button type="button" class="btn btn-outline pull-left" data-dismiss="modal">否</button>
                              <button type="button" class="btn btn-outline">删除</button>
                            </div>
                          </div><!-- /.modal-content -->
                        </div><!-- /.modal-dialog -->
                      </div>
            
            
            
                    	<a href="EditProject.jsp" class="pull-right"><i class="fa fa-fw fa-edit"></i>编辑</a>
                    	<a href="ViewProject.jsp" class="pull-right"><i class="fa fa-fw fa-search"></i>查看详情</a>
                    </li>
                  </ul>
                </div>
              </div><!-- /.widget-user -->
            </div><!-- /.col -->
            
            <div class="col-lg-3 col-xs-6">
              <!-- small box -->
              <div class="small-box bg-aqua">
                <div class="inner">
                  <h3>150</h3>
                  <p>项目总数</p>
                </div>
                <div class="icon">
                  <a href="NewProject.jsp"><i class="fa fa-fw fa-plus"></i></a>
                </div>
                <a href="NewProject.jsp" class="small-box-footer">
                  	点击添加项目 <i class="fa fa-arrow-circle-right"></i>
                </a>
              </div>
            </div>
            
          </div>
        </section><!-- /.content -->
      </div>
	
    <jsp:include page="template/footer.jsp" flush="true"/><!--动态包含footer-->  