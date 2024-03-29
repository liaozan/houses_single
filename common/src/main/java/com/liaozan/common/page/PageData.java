package com.liaozan.common.page;

import java.util.List;

/**
 * @author liaozan
 * @version 1.0.0
 * @since 2018/1/15
 */
public class PageData<T> {

	private List<T> list;
	private Pagination pagination;

	public PageData(Pagination pagination, List<T> list) {
		this.pagination = pagination;
		this.list = list;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public Pagination getPagination() {
		return pagination;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

	public static <T> PageData<T> buildPage(List<T> list, Long count, Integer pageSize, Integer pageNum) {
		Pagination pagination = new Pagination(pageSize, pageNum, count);
		return new PageData<>(pagination, list);
	}

}
