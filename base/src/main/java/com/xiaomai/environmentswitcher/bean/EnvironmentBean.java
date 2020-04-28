package com.xiaomai.environmentswitcher.bean;

import java.io.Serializable;

/**
 * 每个被 {@link com.xiaomai.environmentswitcher.annotation.Environment} 标记的属性，在编译时都会在
 * EnvironmentSwitcher.java 文件中生成与之一一对应的 {@link EnvironmentBean}。
 * <p>
 * Each attribute marked by {@link com.xiaomai.environmentswitcher.annotation.Environment}
 * will generate a one-to-one correspondence with {@link EnvironmentBean} in the  EnvironmentSwitcher.java file at compile time.
 */
public class EnvironmentBean implements Serializable {
    private String name;
    private String alias;
    private String url;
    private ModuleBean module;
    private boolean checked;

    public String getImUrl() {
        return imUrl == null ? "" : imUrl;
    }

    public void setImUrl(String imUrl) {
        this.imUrl = imUrl;
    }

    private String imUrl;
    private String host;

    public EnvironmentBean() {
    }

//    public EnvironmentBean(String name, String url, String alias, ModuleBean module) {
//        this(name, url, alias, module, false, null, null);
//    }

    public EnvironmentBean(String name, String url, String alias, String imUrl, String host, ModuleBean module) {
        this(name, url, alias, module, false, imUrl, host);
    }

    public EnvironmentBean(String name, String url, String alias, ModuleBean module, boolean checked, String imUrl, String host) {
        this.name = name;
        this.url = url;
        this.alias = alias;
        this.module = module;
        this.checked = checked;
        this.imUrl = imUrl;
        this.host = host;
    }

    public String getName() {
        return name == null ? "" : name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url == null ? "" : url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHost() {
        return host == null ? "" : host;
    }

    public String getAlias() {
        return alias == null ? "" : alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public ModuleBean getModule() {
        return module;
    }

    public void setModule(ModuleBean module) {
        this.module = module;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnvironmentBean that = (EnvironmentBean) o;

        if (checked != that.checked) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (alias != null ? !alias.equals(that.alias) : that.alias != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (host != null ? !host.equals(that.host) : that.host != null) return false;
        if (imUrl != null ? !imUrl.equals(that.imUrl) : that.imUrl != null) return false;
        return module != null ? module.equals(that.module) : that.module == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (alias != null ? alias.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (imUrl != null ? imUrl.hashCode() : 0);
        result = 31 * result + (host != null ? host.hashCode() : 0);
        result = 31 * result + (module != null ? module.hashCode() : 0);
        result = 31 * result + (checked ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "EnvironmentBean{" +
                "name='" + name + '\'' +
                ", alias='" + alias + '\'' +
                ", url='" + url + '\'' +
                ", moduleName=" + module.getName() +
                ", moduleAlias=" + module.getAlias() +
                ", host=" + getHost() +
                ", imUrl=" + getImUrl() +
                ", checked=" + checked +
                '}';
    }


    public void setHost(String host) {
        this.host = host;
    }
}

