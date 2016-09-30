package sk.turn.gwtmvp.samples.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.dom.client.Document;

import sk.turn.gwtmvp.client.Mvp;
import sk.turn.gwtmvp.samples.client.presenters.HelloPresenter;
import sk.turn.gwtmvp.samples.client.views.HelloView;

public class SamplesEntryPoint implements EntryPoint {

  @Override
  public void onModuleLoad() {
    Mvp mvp = new Mvp(Document.get().getBody());
    mvp.addPresenter(new HelloPresenter((HelloView) GWT.create(HelloView.class)));
    mvp.start();
  }
}