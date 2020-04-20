package cn.dlj.midware.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.dlj.midware.domain.XyInf;
import cn.dlj.midware.mapper.XyInfMapper;
import cn.dlj.midware.service.XyInfService;

@Service
public class XyInfServiceImpl implements XyInfService {

	@Autowired
	private XyInfMapper xyInfMapper;

	@Override
	public List<XyInf> queryAllByInf() throws Exception {

		return this.xyInfMapper.queryAllByInf();

	}
}
