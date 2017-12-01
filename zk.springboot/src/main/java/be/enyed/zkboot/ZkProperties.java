package be.enyed.zkboot;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "zk")
public class ZkProperties {

  private String updateUri = "/zkau/*";
  private String zulPath = "/";
  private String richletUri = "/richlet/*";
  private Boolean richletEnabled = true;

  public String getUpdateUri() {
	return updateUri;
  }

  public void setUpdateUri(String updateUri) {
	this.updateUri = updateUri;
  }

  public String getRichletUri() {
	return richletUri;
  }

  public void setRichletUri(String richletUri) {
	this.richletUri = richletUri;
  }

  public String getZulPath() {
	return zulPath;
  }

  public void setZulPath(String zulPath) {
	this.zulPath = zulPath;
  }

  public Boolean getRichletEnabled() {
	return richletEnabled;
  }

  public void setRichletEnabled(Boolean richletEnabled) {
	this.richletEnabled = richletEnabled;
  }

}
