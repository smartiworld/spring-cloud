package org.iworld.ohelp.ipay.config;

import org.iworld.ohelp.ribbon.config.UserServiceRibbonConfig;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@RibbonClient(name = "MICSERVICE.USER", configuration = {UserServiceRibbonConfig.class})
public class IPayUserRibbonConfig {

}
