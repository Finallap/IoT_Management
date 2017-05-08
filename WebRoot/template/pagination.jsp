<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
								<ul class="pagination">
                  					<c:choose>
                        				<c:when test="${pagebean.currentPage==1}">
                        					<li class="paginate_button previous disabled" id="example2_previous"><a href="javascript:toPage(1)" onclick="gotopage(1)" aria-controls="example2" data-dt-idx="0" tabindex="0">首页</a></li>
                        					<li class="paginate_button previous disabled" id="example2_previous"><a href="javascript:toPage(${pagebean.previousPage})" aria-controls="example2" data-dt-idx="0" tabindex="0">上一页</a></li>
                        				</c:when>   
                        				<c:otherwise>  
                            				<li class="paginate_button previous" id="example2_previous"><a href="javascript:toPage(1)" onclick="gotopage(1)" aria-controls="example2" data-dt-idx="0" tabindex="0">首页</a></li>
                        					<li class="paginate_button previous" id="example2_previous"><a href="javascript:toPage(${pagebean.previousPage})" aria-controls="example2" data-dt-idx="0" tabindex="0">上一页</a></li>
                        				</c:otherwise>  
                    				</c:choose>
                    				
                    				<c:forEach var="bar" items="${requestScope.pagebean.pageBar}">
                						<li class="paginate_button <c:if test="${bar==pagebean.currentPage}">active</c:if>"><a href="javascript:toPage(${bar})">${bar}</a></li>
            						</c:forEach> 
            						
            						<c:choose>
                        				<c:when test="${pagebean.currentPage==pagebean.totalPages}">
                        					<li class="paginate_button next disabled" id="example2_previous"><a href="javascript:toPage(${pagebean.nextPage})" aria-controls="example2" data-dt-idx="0" tabindex="0">下一页</a></li>
                        					<li class="paginate_button next disabled" id="example2_previous"><a href="javascript:toPage(${pagebean.totalPages})" aria-controls="example2" data-dt-idx="0" tabindex="0">尾页</a></li>
                        				</c:when>   
                        				<c:otherwise>  
                        					<li class="paginate_button next" id="example2_previous"><a href="javascript:toPage(${pagebean.nextPage})" aria-controls="example2" data-dt-idx="0" tabindex="0">下一页</a></li>
                        					<li class="paginate_button next" id="example2_previous"><a href="javascript:toPage(${pagebean.totalPages})" aria-controls="example2" data-dt-idx="0" tabindex="0">尾页</a></li>
                        				</c:otherwise>  
                    				</c:choose>
                  				</ul>