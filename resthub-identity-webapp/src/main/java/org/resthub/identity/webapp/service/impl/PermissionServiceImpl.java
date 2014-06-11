package org.resthub.identity.webapp.service.impl;

import org.resthub.identity.core.repository.PermissionRepository;
import org.resthub.identity.core.service.AbstractPermissionService;
import org.resthub.identity.model.Permission;

import javax.inject.Named;

/**
 * Created by Bastien on 11/06/14.
 */
@Named("permissionService")
public class PermissionServiceImpl extends AbstractPermissionService<Permission, Long, PermissionRepository<Permission, Long>> {
}
