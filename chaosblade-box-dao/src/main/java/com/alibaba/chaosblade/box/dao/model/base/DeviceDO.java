package com.alibaba.chaosblade.box.dao.model.base;

import lombok.Getter;
import lombok.Setter;

import java.util.StringJoiner;

/**
 * @author changjun.xcj
 *
 */
@Setter
@Getter
public class DeviceDO extends BaseDO {

    private String userId;

    private String namespace;

    private String vpcId;

    private String provider;

    /**
     * 如果是k8s，此字段存储k8s的集群id
     */
    private String clusterId;

    /**
     * 集群名称
     */
    private String clusterName;

    private String version;

    private String chaosVersion;

    private String publicIp;

    private String privateIp;

    private String parentIp;

    private Integer port;

    /**
     * 对于ecs主机，存储instanceId
     */
    private String deviceId;

    private Integer deviceType;

    private String deviceName;

    private String deviceRole;

    private String serialNumber;

    private String osVersion;

	/**
	 * os 类型
	 * linux / windows
	 */
	private Integer osType;

    private String hostname;

	/**
	 * 交换机ID
	 */
	private String vswitchId;

    /**
     * 实例规格
     */
    private String spec;

    /**
     * CPU
     */
    private Integer cpu;

    /**
     * MEM,单位M KB
     */
    private Integer mem;

    private String configurationId;

    /**
     * 主机配置ID
     */
    private String hostConfigurationId;

    /**
     * 主机实例ID
     */
    private String hostInstanceId;

    /**
     * 父设备ID
     */
    private String parentConfigurationId;

    /**
     * 父设备名称
     */
    private String parentDeviceName;

    /**
     * 父设备类型
     */
    private Integer parentDeviceType;

    /**
     * 父设备命名空间，如果是k8s，对应k8s的namespace
     */
    private String parentDeviceSpace;

    private Integer status;

    private Boolean enable;

    private String installMode;

    /**
     * 设备创建时间，用于识别设备是否支持云助手通道的安装流程
     */
    private String deviceCreateTime;

    /**
     * 设备启动时间
     */
    private String uptime;

    /**
     * 设备连接时间
     */
    private Long connectTime;

    /**
     * 最近一次对设备执行的命令ID，用于云助手命令执行
     */
    private String commandId;

    /**
     * 最近一次安装或者卸载请求的请求id，用于查询安装状态
     */
    private String requestId;

    /**
     * 命令执行时间
     */
    private Long commandTime;

    /**
     * 请求结果
     */
    private String requestResult;

    /**
     * 故障原因
     */
    private String reason;

    /**
     * 故障原因编码
     */
    private String reasonCode;

    /**
     * 设备元信息md5，用于表示设备信息是否变化
     */
    private String md5;

    /**
     * 扩展信息
     */
    private String extInfo;

    private Long lastHealthPingTime;

    private Long lastOnlineTime;

    //    public String getRegionId() {
//        return regionId;
//    }
//
//    public void setRegionId(String regionId) {
//        this.regionId = regionId;
//    }

    @Override
	public String toString() {
		return new StringJoiner(", ", DeviceDO.class.getSimpleName() + "[", "]")
			.add("userId='" + userId + "'")
			.add("namespace='" + namespace + "'")
			.add("vpcId='" + vpcId + "'")
			.add("provider='" + provider + "'")
//			.add("regionId='" + regionId + "'")
			.add("clusterId='" + clusterId + "'")
			.add("clusterName='" + clusterName + "'")
			.add("version='" + version + "'")
			.add("chaosVersion='" + chaosVersion + "'")
			.add("publicIp='" + publicIp + "'")
			.add("privateIp='" + privateIp + "'")
			.add("parentIp='" + parentIp + "'")
            .add("port='" + port + "'")
			.add("deviceId='" + deviceId + "'")
			.add("deviceType=" + deviceType)
			.add("deviceName='" + deviceName + "'")
			.add("deviceRole='" + deviceRole + "'")
			.add("serialNumber='" + serialNumber + "'")
			.add("osVersion='" + osVersion + "'")
			.add("osType='" + osType + "'")
			.add("hostname='" + hostname + "'")
			.add("vswitchId='" + vswitchId + "'")
			.add("spec='" + spec + "'")
			.add("cpu=" + cpu)
			.add("mem=" + mem)
			.add("configurationId='" + configurationId + "'")
			.add("hostConfigurationId='" + hostConfigurationId + "'")
			.add("hostInstanceId='" + hostInstanceId + "'")
			.add("parentConfigurationId='" + parentConfigurationId + "'")
			.add("parentDeviceName='" + parentDeviceName + "'")
			.add("parentDeviceType=" + parentDeviceType)
			.add("parentDeviceSpace='" + parentDeviceSpace + "'")
			.add("status=" + status)
			.add("enable=" + enable)
			.add("installMode='" + installMode + "'")
			.add("deviceCreateTime='" + deviceCreateTime + "'")
			.add("uptime='" + uptime + "'")
			.add("connectTime=" + connectTime)
			.add("commandId='" + commandId + "'")
			.add("requestId='" + requestId + "'")
			.add("commandTime=" + commandTime)
			.add("requestResult='" + requestResult + "'")
			.add("reason='" + reason + "'")
			.add("reasonCode='" + reasonCode + "'")
			.add("md5='" + md5 + "'")
			.add("extInfo='" + extInfo + "'")
			.add("lastHealthPingTime=" + lastHealthPingTime)
			.add("lastOnlineTime=" + lastOnlineTime)
			.toString();
	}
}
