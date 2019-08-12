package com.heanbian.block.reactive.elasticsearch.client.executor;

import java.io.IOException;

import com.heanbian.block.reactive.elasticsearch.client.operator.Operator;

public class ExecutorImpl implements Executor {

	@Override
	public <R, S> S exec(Operator<R, S> operator, R request) {
		try {
			return operator.operator(request);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}