package com.njupt.bean;

import java.util.List;

public class PageBean {
    private List contentData;    //保存页面数据
    private int totalRecords;    //查询到的总记录数
    private int currentPage;       //用户当前看的页数
    private int pageSize;        //每页多少条显示数据
    private int totalPages;        //总页数
    private int previousPage;    //上一页
    private int nextPage;        //下一页
    private int[] pageBar;        //页码条

//1，contentData可以从QueryResult对象中获取
    public List getContentData() {
		return contentData;
	}

	public void setContentData(List contentData) {
		this.contentData = contentData;
	}
    
    //2，totalRecords可以从QueryResult对象中获取
	public int getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}

    //3，currentPage可以从QueryInfo对象中获取
	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

    //4，pageSize可以从QueryInfo对象中获取
	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	//5，总页数可以由总页数和页面数据大小这两个属性计算，因此无需set方法
	public int getTotalPages() {
        if(totalRecords % pageSize ==0){
            totalPages = totalRecords / pageSize;
        }else{
            totalPages = totalRecords / pageSize + 1;
        }
        return totalPages;
    }

	//6，上一页可以根据当前页计算，因此无需set方法
    public int getPreviousPage() {
        if(currentPage == 1) {
            previousPage = 1;
        }else {
            previousPage = currentPage - 1;
        }
        return previousPage;
    }

    //7，下一页可以根据当前页计算，因此无需set方法
    public int getNextPage() {
        if(currentPage == totalPages) {
            nextPage = totalPages;
        }else {
            nextPage = currentPage + 1;
        }
        return nextPage;
    }

    //8，页码条可以由总页数来计算显示，因此无需set方法
    public int[] getPageBar() {
        pageBar = null;
        int startIndex ;
        int endIndex ;
        if(totalPages<10) {
            pageBar = new int[totalPages];
            startIndex = 1;
            endIndex = totalPages;
            
        }else{
            pageBar = new int[10];
            startIndex = currentPage-5;
            endIndex = currentPage+4;
            if(startIndex<1) {
                startIndex = 1;
                endIndex = 10;
            }
            if(endIndex>totalPages) {
                startIndex = totalPages-10+1;
                endIndex = totalPages;
            }
        }
        int index = 0;
        for(int i=startIndex;i<=endIndex;i++) {
            pageBar[index] = i;
            index++;
        }
        return pageBar;
    }
}