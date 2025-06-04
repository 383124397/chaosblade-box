package com.alibaba.chaosblade.box.service.auth.perimission;

import com.alibaba.chaosblade.box.common.infrastructure.constant.PermissionTypes;
import lombok.*;
import lombok.experimental.FieldDefaults;

/**
 * @author sunju
 *
 */
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor(staticName = "of")
public class PermissionResult {

    public static final PermissionResult NONE = PermissionResult.of(PermissionTypes.NONE);

    public static final PermissionResult ALL = PermissionResult.of(PermissionTypes.ALL);

    public static final PermissionResult W = PermissionResult.of(PermissionTypes.W);

    public static final PermissionResult X = PermissionResult.of(PermissionTypes.X);

    public static final PermissionResult R = PermissionResult.of(PermissionTypes.R);
    final int permission;
    String applyUrl;

    public boolean contains(int perm) {
        return (this.permission & perm) == perm;
    }

    public boolean equals(PermissionResult permissionResult) {
        return null != permissionResult && permissionResult.getPermission() == permission;
    }

}
