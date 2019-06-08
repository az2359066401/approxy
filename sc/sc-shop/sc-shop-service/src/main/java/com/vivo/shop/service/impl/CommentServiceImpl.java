package com.vivo.shop.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.vivo.mapper.CommentMapper;
import com.vivo.pojo.Comment;
import com.vivo.pojo.CommentExample;
import com.vivo.pojo.CommentExample.Criteria;
import com.vivo.shop.service.CommentService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentMapper commentMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Comment> findAll() {
		return commentMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Comment> page=   (Page<Comment>) commentMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Comment comment) {
		commentMapper.insert(comment);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Comment comment){
		commentMapper.updateByPrimaryKey(comment);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Comment findOne(Integer id){
		return commentMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			commentMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Comment comment, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		CommentExample example=new CommentExample();
		Criteria criteria = example.createCriteria();
		
		if(comment!=null){			
						if(comment.getArticleSource()!=null && comment.getArticleSource().length()>0){
				criteria.andArticleSourceLike("%"+comment.getArticleSource()+"%");
			}
			if(comment.getUniqueId()!=null && comment.getUniqueId().length()>0){
				criteria.andUniqueIdLike("%"+comment.getUniqueId()+"%");
			}
			if(comment.getCommentator()!=null && comment.getCommentator().length()>0){
				criteria.andCommentatorLike("%"+comment.getCommentator()+"%");
			}
			if(comment.getContentDate()!=null && comment.getContentDate().length()>0){
				criteria.andContentDateLike("%"+comment.getContentDate()+"%");
			}
			if(comment.getContent()!=null && comment.getContent().length()>0){
				criteria.andContentLike("%"+comment.getContent()+"%");
			}
			if(comment.getReceiver()!=null && comment.getReceiver().length()>0){
				criteria.andReceiverLike("%"+comment.getReceiver()+"%");
			}
			if(comment.getProcessor()!=null && comment.getProcessor().length()>0){
				criteria.andProcessorLike("%"+comment.getProcessor()+"%");
			}
			if(comment.getProcessDate()!=null && comment.getProcessDate().length()>0){
				criteria.andProcessDateLike("%"+comment.getProcessDate()+"%");
			}
			if(comment.getProcessRes()!=null && comment.getProcessRes().length()>0){
				criteria.andProcessResLike("%"+comment.getProcessRes()+"%");
			}
			if(comment.getRejectRes()!=null && comment.getRejectRes().length()>0){
				criteria.andRejectResLike("%"+comment.getRejectRes()+"%");
			}
			if(comment.getRejectDate()!=null && comment.getRejectDate().length()>0){
				criteria.andRejectDateLike("%"+comment.getRejectDate()+"%");
			}
			if(comment.getFinalRes()!=null && comment.getFinalRes().length()>0){
				criteria.andFinalResLike("%"+comment.getFinalRes()+"%");
			}
			if(comment.getFinalDate()!=null && comment.getFinalDate().length()>0){
				criteria.andFinalDateLike("%"+comment.getFinalDate()+"%");
			}
			if(comment.getFinalProcessor()!=null && comment.getFinalProcessor().length()>0){
				criteria.andFinalProcessorLike("%"+comment.getFinalProcessor()+"%");
			}
			if(comment.getProcessStatus()!=null && comment.getProcessStatus().length()>0){
				criteria.andProcessStatusLike("%"+comment.getProcessStatus()+"%");
			}
			if(comment.getExt1()!=null && comment.getExt1().length()>0){
				criteria.andExt1Like("%"+comment.getExt1()+"%");
			}
			if(comment.getExt2()!=null && comment.getExt2().length()>0){
				criteria.andExt2Like("%"+comment.getExt2()+"%");
			}
	
		}
		
		Page<Comment> page= (Page<Comment>)commentMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
