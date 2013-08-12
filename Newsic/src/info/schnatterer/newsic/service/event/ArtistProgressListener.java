package info.schnatterer.newsic.service.event;

import info.schnatterer.newsic.db.model.Artist;

import org.apache.commons.lang3.ObjectUtils.Null;

/**
 * Returns <code>true</code>, if anything changed, otherwise <code>false</code>
 * or {@link Null}.
 * 
 * @author schnatterer
 * 
 */
public interface ArtistProgressListener extends
		ProgressListener<Artist, Boolean> {

}
