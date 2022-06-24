package oop;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapExercise {
    public static void main(String[] args) {
        Video video = new Video("GOT1", "got1.com", VideoType.CLIP);
        Video video1 = new Video("GOT2", "got2.com", VideoType.EPISODE);
        Video video2 = new Video("GOT3", "got3.com", VideoType.PREVIEW);
        Video video3 = new Video("GOT4", "got4.com", VideoType.PREVIEW);
        Video video4 = new Video("GOT5", "got5.com", VideoType.CLIP);
        Video video5 = new Video("GOT6", "got6.com", VideoType.EPISODE);
        Episode episode = new Episode("got1", 1,
                Arrays.asList(video, video1));
        Episode episode1 = new Episode("got2", 2,
                Arrays.asList(video2, video3));
        Episode episode2 = new Episode("got3", 1,
                Arrays.asList(video4, video5));

        Season season = new Season("GOTS1", 1,
                Arrays.asList(episode, episode1));

        Season season1 = new Season("GOTS1", 2,
                Arrays.asList(episode2));
        List<Season> seasons = Arrays.asList(season, season1);
        //1
        List<Episode> _1 = (List<Episode>) seasons.stream().flatMap((Season s)->{
            return s.episodes.stream();
        }).collect(Collectors.toList());
        System.out.println(_1);
//3
        List<String> seasonNames = seasons.stream().map((Season s2)->{
            return s2.seasonName;
        }).collect(Collectors.toList());
        System.out.println(seasonNames);
        //9
        List<Episode> _9 = (List<Episode>) seasons.stream().filter((Season s)->{
            return s.seasonNumber%2 == 0;
        }).flatMap((Season p)->{
            return p.episodes.stream();
        }).collect(Collectors.toList());
        System.out.println(_9);
        //10
        List<Video> _10 = (List<Video>) seasons.stream().filter((Season s)->{
            return s.seasonNumber%2 == 0;
        }).flatMap((Season p)->{
            return p.episodes.stream();
        }).flatMap((Episode v)->{
            return v.videos.stream();
        }).collect(Collectors.toList());
        System.out.println(_10);
        //11
        List<Video> _11 = (List<Video>) seasons.stream().filter((Season s)->{
            return s.seasonNumber%2 == 0;
        }).flatMap((Season p)->{
            return p.episodes.stream();
        }).filter((Episode e)->{
            return e.episodeNumber%2 ==0;
        }).flatMap((Episode v)->{
            return v.videos.stream();
        }).collect(Collectors.toList());
        System.out.println(_11);
        //12
        List<Video> _12 = (List<Video>) seasons.stream().filter((Season s)->{
            return s.seasonNumber%2 == 1;
        }).flatMap((Season p)->{
            return p.episodes.stream();
        }).filter((Episode e)->{
            return e.episodeNumber%2 ==0;
        }).flatMap((Episode v)->{
            return v.videos.stream();
        }).filter((Video t)->{
            return t.videoType == VideoType.CLIP;
        }).collect(Collectors.toList());
        System.out.println(_12);
        //13
        List<Video> _13 = (List<Video>) seasons.stream().filter((Season s)->{
            return s.seasonNumber%2 == 0;
        }).flatMap((Season p)->{
            return p.episodes.stream();
        }).filter((Episode e)->{
            return e.episodeNumber%2 ==1;
        }).flatMap((Episode v)->{
            return v.videos.stream();
        }).filter((Video t)->{
            return t.videoType == VideoType.PREVIEW;
        }).collect(Collectors.toList());
        System.out.println(_13);
    }

    static class Season {
        public String seasonName;
        public int seasonNumber;
        List<Episode> episodes;
        public Season(String seasonName, int seasonNumber, List<Episode> episodes) {
            this.seasonName = seasonName;
            this.seasonNumber = seasonNumber;
            this.episodes = episodes;
        }
    }

    static class Episode {
        public String episodeName;
        public int episodeNumber;
        List<Video> videos;

        public Episode(String episodeName, int episodeNumber, List<Video> videos) {
            this.episodeName = episodeName;
            this.episodeNumber = episodeNumber;
            this.videos = videos;
        }

        @Override
        public String toString() {
            return "Episode{" +
                    "episodeName='" + episodeName + '\'' +
                    ", episodeNumber=" + episodeNumber +
                    ", videos=" + videos +
                    '}';
        }
    }

    static class Video{
        public String title;
        public String url;
        public VideoType videoType;

        public Video(String title, String url, VideoType videoType) {
            this.title = title;
            this.url = url;
            this.videoType = videoType;
        }

        @Override
        public String toString() {
            return "Video{" +
                    "title='" + title + '\'' +
                    ", url='" + url + '\'' +
                    ", videoType=" + videoType +
                    '}';
        }
    }

    enum VideoType {
        CLIP, PREVIEW, EPISODE
    }
}

