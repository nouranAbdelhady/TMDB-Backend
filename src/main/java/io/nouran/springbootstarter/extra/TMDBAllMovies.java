package io.nouran.springbootstarter.extra;

import java.util.List;

public class TMDBAllMovies {
        int page;
        List<TMDBSingleMovie> results;
        int total_pages;
        int total_results;

        public TMDBAllMovies() {
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public List<TMDBSingleMovie> getResults() {
            return results;
        }

        public void setResults(List<TMDBSingleMovie> results) {
            this.results = results;
        }

        public int getTotalPages() {
            return total_pages;
        }

        public void setTotalPages(int total_pages) {
            this.total_pages = total_pages;
        }

        public int getTotalResults() {
            return total_results;
        }

        public void setTotalResults(int total_results) {
            this.total_results = total_results;
        }

        @Override
        public String toString() {
            return "TMDBAllMovies{" +
                    "page=" + page +
                    ", results=" + results +
                    ", total_pages=" + total_pages +
                    ", total_results=" + total_results +
                    '}';
        }
    
}
