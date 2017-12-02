package be.enyed.zkboot.viewmodel;

import java.util.List;

import org.zkoss.bind.annotation.ExecutionParam;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zul.ListModelList;

public class DataViewModel {

  private ListModelList<String> data;

  @Init
  public void init(@ExecutionParam("data") List<String> data) {
	this.data = new ListModelList<>(data);
  }

  public ListModelList<String> getData() {
	return data;
  }

}
