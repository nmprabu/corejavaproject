package com.corejavaproject.designpattern.bridgedesign;

public interface FileDownloaderAbstraction {
    public Object download(String path);

    public boolean store(Object object);
}
