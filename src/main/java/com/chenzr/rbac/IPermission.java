package com.chenzr.rbac;

/**
 * 粗粒度权限API
 * @author chenzr
 *
 */
public interface IPermission {

	/**
	 * 通过传入一个orgid ， 拿到当前这个org对象都具有那些访问权限。 
	 * @param orgId
	 */
	void getPermissionByOrgId(String orgId);
	
	/**
	 * 通过传入一个org的id 和 一个资源的id ， 返回改Org对当前这个资源的访问权限。 
	 * @param orgId
	 * @param resouceId
	 */
	void getSourcePermissionByOrgId(String orgId , String resouceId);
	
	/**
	 *  通过传入一个资源的id ， 得到当前资源下都有那些权限定义。
	 * @param resource
	 */
	void getPermissionByResourceId(String resourceId);
	
	/**
	 * 传入一个orgGuid， 资源ID ，查看改OrgId下对资源是否有向下继承的权限。
	 * 这里继承是资源的继承。即对父栏目有权限，可以继承下去对父栏目下的子栏目同样有权限。 
	 * @param orgId
	 * @param resouceId
	 * @return
	 */
	boolean havingHeritPermission(String orgId , String resouceId);
	
	/**
	 * 判断某Org对某一资源是否用权限。 
	 * @param orgId
	 * @param resourceId
	 * @return
	 */
	boolean havingPermission(String orgId , String resourceId);
}
