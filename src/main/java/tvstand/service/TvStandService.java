package tvstand.service;

import org.springframework.stereotype.Service;
import ro.sapientia.furniture.model.FurnitureBody;
import ro.sapientia.furniture.repository.FurnitureBodyRepository;
import tvstand.model.Tvstand;
import tvstand.repository.TvStandRepository;

import java.util.List;

@Service
public class TvStandService {

	private final TvStandRepository tvStandRepository;

	public TvStandService(final TvStandRepository tvStandRepository) {
		this.tvStandRepository = tvStandRepository;
	}
	
	public List<Tvstand> findAllTvStand() {
		return this.tvStandRepository.findAll();
	}

	public Tvstand findTvStandById(final Long id) {
		return this.tvStandRepository.findTvStandById(id);
	}

	public Tvstand create(Tvstand tvStand) {
		return this.tvStandRepository.saveAndFlush(tvStand);
	}

	public Tvstand update(Tvstand tvStand) {
		return this.tvStandRepository.saveAndFlush(tvStand);
	}

	public void delete(Long id) {
		this.tvStandRepository.deleteById(id);
	}

}
