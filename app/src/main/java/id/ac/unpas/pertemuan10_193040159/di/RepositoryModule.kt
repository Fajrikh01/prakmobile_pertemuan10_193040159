package id.ac.unpas.pertemuan10_193040159.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import id.ac.unpas.pertemuan10_193040159.networks.SetoranSampahApi
import id.ac.unpas.pertemuan10_193040159.persistences.SetoranSampahDao
import id.ac.unpas.pertemuan10_193040159.repositories.SetoranSampahRepository

@Module
@InstallIn (ViewModelComponent::class)
object RepositoryModule {
    @Provides
    @ViewModelScoped
    fun provideSetoranSampahRepository(
        api: SetoranSampahApi,
        dao: SetoranSampahDao
    ): SetoranSampahRepository {
        return SetoranSampahRepository(api, dao)
    }
}