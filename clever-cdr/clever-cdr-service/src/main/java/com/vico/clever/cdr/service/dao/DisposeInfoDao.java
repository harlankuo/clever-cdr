package com.vico.clever.cdr.service.dao;

import com.vico.clever.cdr.service.model.Dispose;
import com.vico.clever.cdr.service.model.DisposeAction;

/**
 * 
 * @author Yuan.Ziyang
 */
public interface DisposeInfoDao {
	/*
	 * selectDispose deleteDispose insertDispose updateDispose
	 * 
	 * selectDisposeAction deleteDisposeAction insertDisposeAction
	 */

	public Dispose selectDispose(String disposeID);

	public int deleteDispose(String disposeID);

	public int insertDispose(Dispose dispose);

	public int updateDispose(Dispose dispose);

	public int insertDisposeAction(DisposeAction disposeAction);
}
