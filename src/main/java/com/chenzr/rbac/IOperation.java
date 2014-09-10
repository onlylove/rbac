package com.chenzr.rbac;

/**
 * 细粒度权限
 * 
 * @author chenzr
 * 
 */
public interface IOperation {

	/**
	 * 通过permission 的id 得到该permission 的所有有效操作
	 * 
	 * @param permissionId
	 */
	void getOperationByPermission(String permissionId);

	/**
	 * 通过permision的id ， 资源的id 得到该资源下所有的有效操作。
	 * 
	 * @param permissionId
	 * @param resourceId
	 */
	void getOperationByPermission(String permissionId, String resourceId);

	/**
	 * 通过permissionId ， resourceId ， org的id 得到改Org对这一资源的有效操作
	 * 
	 * @param permissionId
	 * @param resourceId
	 * @param orgId
	 */
	void screeningOpreationByPermission(String permissionId, String resourceId,
			String orgId);
	
	/**
	 * 通过传入的operationId 返回是否具有操作权限。 
	 * @param operationId
	 * @return
	 */
	boolean hasOperation(String operationId);
}
