package co.edu.uniandes.dse.parcialejemplo.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.uniandes.dse.parcialejemplo.entities.MedicoEntity;

@Service
public class MedicoService {

	@Autowired
	private MedicoRepository medicoRepository;
	
	/**
	 * 
	 * @return
	 */
	@Transactional
	public List<MedicoEntity> getMedicos() {
		return medicoRepository.findAll();
	}
}
