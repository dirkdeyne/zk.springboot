package be.enyed.zkboot;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "zk.ee")
public class ZkEEProperties {

  // use "org.zkoss.zkmax.ws.filter.installed" when FR ZK-3799 is ready (8.5.1 ?)
  private String comet = "org.zkoss.zkmax.ui.comet.async.installed";
  private Boolean websocketsEnabled = false;

  public String getComet() {
	return comet;
  }

  public void setComet(String comet) {
	this.comet = comet;
  }

  public Boolean getWebsocketsEnabled() {
	return websocketsEnabled;
  }

  public void setWebsocketsEnabled(Boolean websocketsEnabled) {
	this.websocketsEnabled = websocketsEnabled;
  }

}
