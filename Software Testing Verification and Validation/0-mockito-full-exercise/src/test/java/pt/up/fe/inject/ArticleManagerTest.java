package pt.up.fe.inject;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ArticleManagerTest {

  @Mock
  private ArticleDatabase articleDatabase;

  @Mock
  private User user;

  @InjectMocks
  private ArticleManager manager;

  @Test
  public void ensureInjectMockWorks() {
    // Calls addListener with an instance of ArticleListener
    manager.initialize();
    // TODO: verify that addListener was called with any (instance) of ArticleListener.class

    verify(articleDatabase, atLeastOnce()).addListener(any(ArticleListener.class));
  }
}
