/**
 * FileName: IESHighLevelOpertor
 * Author:   tumq
 * Date:     2018/12/14 16:29
 * Description: 高亮操作
 */
package net.dgg.framework.tac.elasticsearch.core.operator;

import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 〈一句话功能简述〉<br> 
 * 〈高亮操作〉
 *
 * @author tumq
 * @create 2018/12/14
 */
public abstract class DggESHighLevelOpertor<R,S> extends DggAbstractOpertor<RestHighLevelClient,R,S>{

    @Override
    public RestHighLevelClient getRestClient() {
        return DggESHighLevelClient.getInstance().getRestHighLevelClient();
    }
}