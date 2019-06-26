package com.heanbian.block.elasticsearch.client.operator;

import java.io.IOException;

import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClientBuilder;

public interface HOperator<E, R, S> {

	public E getRestClient();

	public S operator(E client, R request) throws IOException;

	public RestClientBuilder getBuilder();

	public void setBuilder(RestClientBuilder builder);

	public RequestOptions getRequestOptions();

	public void setRequestOptions(RequestOptions requestOptions);
}
