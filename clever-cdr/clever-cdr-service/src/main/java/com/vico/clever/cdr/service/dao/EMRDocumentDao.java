package com.vico.clever.cdr.service.dao;

import java.util.List;

import com.vico.clever.cdr.service.model.EMRDocument;
import com.vico.clever.cdr.service.model.EMRDocumentAction;
import com.vico.clever.cdr.service.model.EMRDocumentDetails;;
public interface EMRDocumentDao {
	
	public EMRDocument selectEMRDocument(String documentID);
    public int deleteEMRDocument(String documentID);
    public int insertEMRDocument(EMRDocument emrDocument);
    public int updateEMRDocument(EMRDocument emrDocument);
    
    public List<EMRDocumentDetails> selectEMRDocumentDetial(String documentID);
    public int deleteEMRDocumentDetails(String documentID);
    public int insertEMRDocumentDetails(List<EMRDocumentDetails>  emrDocumentDetailsList);
    //public int updateEMRDocumentDetails(List<EMRDocumentDetails>  emrDocumentDetailsList);
    
    public List<EMRDocumentAction> selectEMRDocumentAction(String documentID);
    public int deleteEMRDocumentAction(String documentID);
    public int insertEMRDocumentAction(EMRDocumentAction emrDocumentAction);
   // public int updateEMRDocumentAction(EMRDocumentAction emrDocumentAction);
    
    
    
}
