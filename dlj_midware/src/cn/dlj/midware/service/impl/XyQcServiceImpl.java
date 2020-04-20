package cn.dlj.midware.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.dlj.midware.domain.XyQc;
import cn.dlj.midware.mapper.XyQcMapper;
import cn.dlj.midware.service.XyQcService;

@Service
public class XyQcServiceImpl implements XyQcService {

	@Autowired
	XyQcMapper xyQcMapper;

	@Override
	public List<XyQc> queryAllByQc() {
		
		return this.xyQcMapper.queryAllByQc();
	}

}
