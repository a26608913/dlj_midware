package cn.dlj.midware.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.dlj.midware.domain.XyInf;
import cn.dlj.midware.domain.XyOper;
import cn.dlj.midware.domain.XyQc;
import cn.dlj.midware.service.XyInfService;
import cn.dlj.midware.service.XyOperService;
import cn.dlj.midware.service.XyQcService;

@RestController
@RequestMapping("xf")
public class XySysAtcion {

	@Autowired
	private XyOperService xyOperService;
	@Autowired
	private XyInfService xyInfService;
	@Autowired
	private XyQcService xyQcService;

	
	@RequestMapping("oper")
	public List<XyOper> xyoper() throws Exception {

		return this.xyOperService.queryAllByOper();
	}
	
	public List<XyInf> xyinf() throws Exception {
		return this.xyInfService.queryAllByInf();
	}
	
	public List<XyQc> xyqc() {
		return this.xyQcService.queryAllByQc();
	}
}
