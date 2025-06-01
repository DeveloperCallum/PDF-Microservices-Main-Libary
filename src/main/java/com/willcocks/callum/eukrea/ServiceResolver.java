package com.willcocks.callum.eukrea;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import java.util.List;
import java.util.Random;

public class ServiceResolver {
    public static Random random = new Random();

    public static ServiceInstance resolveName(DiscoveryClient discoveryClient, String serviceName){
        List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances(serviceName);

        if (serviceInstanceList.isEmpty()) {
            throw new IllegalStateException("No available service instances for " + serviceName);
        }

        return serviceInstanceList.get(random.nextInt(serviceInstanceList.size()));
    }
}
