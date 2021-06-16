package br.com.lf.wsapi.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class MatchGoogleDTO implements Serializable{
	
	private static final long seriaVersionUID = 1L;
	
	private String matchStatus;
	private String matchTime;

	
	// Home team informations
	private String homeTeamName;
	private String homeTeamLogoUrl;
	private String homeTemaScoreboard;
	private String homeTeamGoals;
	private String extendedScoreboard;
	
	// Visiting team informations
	private String visitingTeamName;
	private String visitingTeamLogoUrl;
	private String visitingTemaScoreboard;
	private String visitingTeamGoals;
	private String extendedScoreboard2;
}
