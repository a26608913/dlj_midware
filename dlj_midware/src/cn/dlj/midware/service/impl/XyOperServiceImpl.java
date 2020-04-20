package cn.dlj.midware.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.dlj.midware.domain.XyOper;
import cn.dlj.midware.mapper.XyOperMapper;
import cn.dlj.midware.service.XyOperService;

@Service
public class XyOperServiceImpl implements XyOperService {

	@Autowired
	private XyOperMapper xyOperMapper;

	@Override
	public List<XyOper> queryAllByOper() throws Exception{

		return this.xyOperMapper.queryAllByOper();
	}
}
