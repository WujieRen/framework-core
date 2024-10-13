package cn.rwj.framework.spring.cores.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * 资源对象接口
 *
 * @author rwj
 * @since 2024/10/13
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}
