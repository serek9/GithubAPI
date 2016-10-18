import retrofit2.Call;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        GitHubService service = GitHubService.retrofit.create(GitHubService.class);
        Call<List<Repo>> repos = service.listRepos("octocat");
        List<Repo> resultado = repos.execute().body();
        System.out.println(resultado);
    }
}
