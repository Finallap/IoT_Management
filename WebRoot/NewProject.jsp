  <%@ page language="java" import="java.util.*"%>  
  <%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
 	
 	
	<jsp:include page="template/header.jsp" flush="true"/><!--动态包含header-->


	<div class="content-wrapper" style="min-height: 916px;">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
            	项目添加
            <small>在此页面添加项目</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="index.jsp"><i class="fa fa-dashboard"></i> 首页</a></li>
            <li><a href="ProjectProfile.jsp">项目管理</a></li>
            <li class="active">项目添加</li>
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
                  <h3 class="box-title">项目添加</h3>
                </div><!-- /.box-header -->
                <!-- form start -->
                <form role="form" method="post" action="NewProject"  onSubmit="return check()">
                  <div class="box-body">
                    <div class="form-group">
                      <label for="exampleInputEmail1">项目名称</label>
                      <input type=text class="form-control" placeholder="输入项目名称" name="projectname" id="projectname">
                    </div>
                    <div class="form-group">
                    	<label for="exampleInputEmail1">项目类型</label>
						<select class="form-control select2 select2-hidden-accessible" style="width: 100%;" tabindex="-1" aria-hidden="true" name="ispublic" id="ispublic">
                     	 <option selected="selected" value="1">公开</option>
                     	 <option value="0">私密</option>
                   	 	</select>
                    </div>
                    <div class="form-group">
                      <label for="exampleInputEmail1">项目Key</label>
                      <input type=text readonly="readonly" class="form-control" placeholder="输入项目Key" name="projectkey" id="projectkey" value="<%= UUID.randomUUID().toString().trim().replaceAll("-", "")%>">
                    </div>
                  </div><!-- /.box-body -->

                  <div class="box-footer">
                    <button type="submit" class="btn btn-primary">创建</button>
                  </div>
                </form>
              </div><!-- /.box -->

            </div>
          </div>
          
          </section>
      </div>
      
	<script type="text/javascript"> 
		function check()
		{
            if((document.getElementById("projectname").value=="")){  
                alert("项目名称不能为空"); 
				return false;  
            }
            else if((document.getElementById("projectname").value.length>15)){  
                alert("项目名称不能超过15个字符"); 
				return false;  
            }
			else{ 
               return true;
            }  
        }
 	</script> 

      <jsp:include page="template/footer.jsp" flush="true"/><!--动态包含footer-->  